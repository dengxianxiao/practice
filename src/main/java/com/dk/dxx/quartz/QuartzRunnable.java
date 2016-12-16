package com.dk.dxx.quartz;

import java.util.ArrayList;
import java.util.List;

import org.quartz.CronScheduleBuilder;
import org.quartz.CronTrigger;
import org.quartz.JobBuilder;
import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.TriggerBuilder;
import org.quartz.TriggerKey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

import com.dk.dxx.entity.ScheduleJob;

/**
 * ��������
 * @author dxx
 *
 */
public class QuartzRunnable {

	private static final Logger logger = LoggerFactory.getLogger(QuartzRunnable.class);

    private ApplicationContext context;

    /**
     * 
     * ���캯��, ���� applicationContext
     *
     * @param context
     */
    public QuartzRunnable(ApplicationContext context) {
        this.context = context;
    }

    public void work() throws SchedulerException {
        logger.info("quartz is running ...");
        // scheduler ����
        Scheduler schedulerCluster = (Scheduler) context.getBean("clusterQuartzScheduler");
        Scheduler schedulerLocal = (Scheduler) context.getBean("localQuartzScheduler");

        ScheduleJob sj = new ScheduleJob();
        sj.setJobId("id");
        sj.setJobName("name");
        sj.setJobGroup("group");
        sj.setIsCluster(1);
        sj.setCronExpression("0/5 * * * * ?");
        sj.setDescription("测试任务");
        sj.setTargetObject("testInvokeImpl");
        sj.setTargetMethod("testInvoke");
        List<ScheduleJob> allQuartzJobs = new ArrayList<ScheduleJob>(); // ����ݿ���������ļ����������κεط�ȡ�� Quartz ����������ļ��� ScheduleJob ����Ϊ�Զ���� Quartz �������ã���������Լ�����
        allQuartzJobs.add(sj);
        
        // ������ʱ����
        for (ScheduleJob job : allQuartzJobs) {
            // ��ֱ������л�Ⱥ����
            Scheduler scheduler;
            if (job.getIsCluster() == 1) {
                scheduler = schedulerCluster;
            } else {
                scheduler = schedulerLocal;
            }

            TriggerKey triggerKey = TriggerKey.triggerKey(job.getJobName(), job.getJobGroup());
            CronTrigger trigger = (CronTrigger) scheduler.getTrigger(triggerKey);
            //�����ڣ�����һ��
            if (null == trigger) {
                JobDetail jobDetail = JobBuilder.newJob(MyDetailQuartzJobBean.class).withIdentity(job.getJobName(), job.getJobGroup()).build();
                JobDataMap dataMap = jobDetail.getJobDataMap();
                dataMap.put("scheduleJob", job); // ���� job ������ִ�еķ�����

                //���ʽ���ȹ�����
                CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(job.getCronExpression());
                //���µ�cronExpression���ʽ����һ���µ�trigger
                trigger = TriggerBuilder.newTrigger().withIdentity(job.getJobName(), job.getJobGroup()).withSchedule(scheduleBuilder).withDescription(job.getDescription()).build();
                scheduler.scheduleJob(jobDetail, trigger);
            } else {
                // Trigger�Ѵ��ڣ���ô������Ӧ�Ķ�ʱ����
                //���ʽ���ȹ�����
                CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(job.getCronExpression());
                //���µ�cronExpression���ʽ���¹���trigger
                trigger = trigger.getTriggerBuilder().withIdentity(triggerKey).withSchedule(scheduleBuilder).build();
                //���µ�trigger��������jobִ��
                scheduler.rescheduleJob(triggerKey, trigger);
            }
        }
    }
}
