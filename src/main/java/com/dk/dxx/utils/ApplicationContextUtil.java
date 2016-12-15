package com.dk.dxx.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * ��ȡbean������
 * 
 * @author dxx
 *
 */
 public class ApplicationContextUtil implements ApplicationContextAware {

	 private static ApplicationContext applicationContext; // SpringӦ�������Ļ���

	    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
	        ApplicationContextUtil.applicationContext = applicationContext;
	    }

	    public static ApplicationContext getApplicationContext() {
	        return applicationContext;
	    }

	    public static Object getBean(String beanName) {
	        return applicationContext.getBean(beanName);
	    }

	    @SuppressWarnings("unchecked")
	    public static <T> T getBeanDetail(String beanName) throws BeansException {
	        return (T) applicationContext.getBean(beanName);
	    }
	}

