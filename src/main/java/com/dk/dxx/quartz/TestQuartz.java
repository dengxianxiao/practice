package com.dk.dxx.quartz;

import org.quartz.SchedulerException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestQuartz {

	ApplicationContext context = null;
	
	@org.junit.Test
	public void test() {
//		System.out.println("hello world");
//		new ClassPathXmlApplicationContext("testSpring.xml");
	}
	
	//������Ȳ���junit���У�ִֻ��һ��
	public static void main(String[] args) {
		
		
//		System.out.println("hello world");
//		new ClassPathXmlApplicationContext("test-spring-quartz.xml");
		
		 // ��ʼ�� Spring
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("test-spring-schedulerJob.xml");

        // ������ʱ����
        QuartzRunnable quartz = new QuartzRunnable(applicationContext);
        try {
			quartz.work();
		} catch (SchedulerException e) {
			e.printStackTrace();
		}
	}
}
