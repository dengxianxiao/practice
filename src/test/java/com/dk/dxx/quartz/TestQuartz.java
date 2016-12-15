package com.dk.dxx.quartz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestQuartz {

	ApplicationContext context = null;
	
	@org.junit.Test
	public void test() {
//		System.out.println("hello world");
//		new ClassPathXmlApplicationContext("testSpring.xml");
	}
	
	//任务调度测试junit不行，只执行一次
	public static void main(String[] args) {
		System.out.println("hello world");
		new ClassPathXmlApplicationContext("test-spring-quartz.xml");
	}
}
