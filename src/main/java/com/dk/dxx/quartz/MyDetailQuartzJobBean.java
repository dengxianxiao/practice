package com.dk.dxx.quartz;

import org.quartz.*;  
import org.slf4j.Logger;  
import org.slf4j.LoggerFactory;  
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.dk.dxx.entity.ScheduleJob;
import com.dk.dxx.utils.ApplicationContextUtil;

import java.lang.reflect.Method;

/**
 * 动态运行方法
 */
//@PersistJobDataAfterExecution
//@DisallowConcurrentExecution //确保多个任务不会同时运行
public class MyDetailQuartzJobBean extends QuartzJobBean {  
    private static final Logger logger = LoggerFactory.getLogger(MyDetailQuartzJobBean.class);

    private ScheduleJob scheduleJob;

    protected void executeInternal(JobExecutionContext context)
            throws JobExecutionException {
        try {
            Object targetObject = ApplicationContextUtil.getBean(scheduleJob.getTargetObject());
            Method m;
            try {
                m = targetObject.getClass().getMethod(scheduleJob.getTargetMethod(), new Class[]{});
                m.invoke(targetObject, new Object[]{});
            } catch (SecurityException e) {
                logger.error(e.getMessage(), e);
            } catch (NoSuchMethodException e) {
                logger.error(e.getMessage(), e);
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw new JobExecutionException(e);
        }

    }

    public void setScheduleJob(ScheduleJob scheduleJob) {
        this.scheduleJob = scheduleJob;
    }
}
