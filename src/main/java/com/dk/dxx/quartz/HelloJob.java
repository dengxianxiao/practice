package com.dk.dxx.quartz;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class HelloJob implements Job {
	
	private Logger logger = Logger.getLogger(this.getClass());

	public HelloJob() {
		
	}
	
	 public void execute(JobExecutionContext context)
		        throws JobExecutionException {
		 logger.setLevel(Level.INFO);
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        logger.info("Hello World! - " + sdf.format(new Date()));
     }
}
