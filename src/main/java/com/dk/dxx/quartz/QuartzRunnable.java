package com.dk.dxx.quartz;

import java.util.List;

import org.slf4j.Logger;
import org.quartz.*;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

import com.dk.dxx.entity.ScheduleJob;

/**
 * 任务启动
 * @author dxx
 *
 */
public class QuartzRunnable {

	private static final Logger logger = LoggerFactory.getLogger(QuartzRunnable.class);

    private ApplicationContext context;

    /**
     * 
     * 构造函数, 传入 applicationContext
     *
     * @param context
     */
    public QuartzRunnable(ApplicationContext context) {
        this.context = context;
    }

    public void work() throws SchedulerException {
        logger.info("quartz is running ...");
        // scheduler 对象
        Scheduler schedulerCluster = (Scheduler) context.getBean("clusterQuartzScheduler");
        Scheduler schedulerLocal = (Scheduler) context.getBean("localQuartzScheduler");

        List<ScheduleJob> allQuartzJobs = null; // 从数据库或者配置文件或者其他任何地方取得 Quartz 任务的配置文件， ScheduleJob 对象为自定义的 Quartz 任务设置，对象的属性见下文

        // 启动定时任务
        for (ScheduleJob job : allQuartzJobs) {
            // 区分本机运行或集群运行
            Scheduler scheduler;
            if (job.getIsCluster() == 1) {
                scheduler = schedulerCluster;
            } else {
                scheduler = schedulerLocal;
            }

            TriggerKey triggerKey = TriggerKey.triggerKey(job.getJobName(), job.getJobGroup());
            CronTrigger trigger = (CronTrigger) scheduler.getTrigger(triggerKey);
            //不存在，创建一个
            if (null == trigger) {
                JobDetail jobDetail = JobBuilder.newJob(MyDetailQuartzJobBean.class).withIdentity(job.getJobName(), job.getJobGroup()).build();
                JobDataMap dataMap = jobDetail.getJobDataMap();
                dataMap.put("scheduleJob", job); // 传递 job 对象至执行的方法体

                //表达式调度构建器
                CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(job.getCronExpression());
                //按新的cronExpression表达式构建一个新的trigger
                trigger = TriggerBuilder.newTrigger().withIdentity(job.getJobName(), job.getJobGroup()).withSchedule(scheduleBuilder).withDescription(job.getDescription()).build();
                scheduler.scheduleJob(jobDetail, trigger);
            } else {
                // Trigger已存在，那么更新相应的定时设置
                //表达式调度构建器
                CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(job.getCronExpression());
                //按新的cronExpression表达式重新构建trigger
                trigger = trigger.getTriggerBuilder().withIdentity(triggerKey).withSchedule(scheduleBuilder).build();
                //按新的trigger重新设置job执行
                scheduler.rescheduleJob(triggerKey, trigger);
            }
        }
    }
}
