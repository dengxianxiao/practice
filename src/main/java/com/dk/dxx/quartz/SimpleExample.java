package com.dk.dxx.quartz;

import static org.quartz.DateBuilder.evenMinuteDate;
import static org.quartz.JobBuilder.newJob;
import static org.quartz.TriggerBuilder.newTrigger;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleExample {

	 public void run() throws Exception {
		    Logger log = LoggerFactory.getLogger(SimpleExample.class);

		    log.warn("------- 初始化 ----------------------");

		    SchedulerFactory sf = new StdSchedulerFactory();
		    Scheduler sched = sf.getScheduler();

		    log.warn("------- 初始化完成 -----------");

		    Date runTime = evenMinuteDate(new Date());

		    log.warn("-------定时任务  -------------------");

		    JobDetail job = newJob(HelloJob.class).withIdentity("job1", "group1").build();

		    // Trigger the job to run on the next round minute
		    Trigger trigger = newTrigger().withIdentity("trigger1", "group1").startAt(runTime).build();

		    // Tell quartz to schedule the job using our trigger
		    sched.scheduleJob(job, trigger);
		    log.warn(job.getKey() + " will run at: " + runTime);

		    // Start up the scheduler (nothing can actually run until the
		    // scheduler has been started)
		    sched.start();

		    log.warn("------- Started Scheduler -----------------");

		    // wait long enough so that the scheduler as an opportunity to
		    // run the job!
		    log.warn("------- Waiting 5 seconds... -------------");
		    try {
		      // wait 65 seconds to show job
		      Thread.sleep(65L * 1000L);
		      // executing...
		    } catch (Exception e) {
		      //
		    }

		    // shut down the scheduler
		    log.warn("------- Shutting Down ---------------------");
		    sched.shutdown(true);
		    log.warn("------- Shutdown Complete -----------------");
		  }

		  public static void main(String[] args) throws Exception {

		    SimpleExample example = new SimpleExample();
		    example.run();

		  }
}
