package com.dk.dxx.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 获取bean工具类
 * 
 * @author dxx
 *
 */
 public class ApplicationContextUtil implements ApplicationContextAware {

	 private static ApplicationContext applicationContext; // Spring应用上下文环境

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

