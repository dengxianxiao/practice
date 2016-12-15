package com.dk.dxx.entity;

/**
 * 任务调度quartz数据库动态配置
 * 
 * @author dxx
 *
 */
public class ScheduleJob {

	 private String jobId; // 任务 ID
    private String jobName; // 任务名称
    private String jobGroup; // 任务分组
    private String cronExpression; // 时间表达式
    private String description; // 任务描述

    private String targetObject; // Spring 注入的类名
    private String targetMethod; // 方法

    private int isCluster;// 是否集群运行

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getJobGroup() {
		return jobGroup;
	}

	public void setJobGroup(String jobGroup) {
		this.jobGroup = jobGroup;
	}

	public String getCronExpression() {
		return cronExpression;
	}

	public void setCronExpression(String cronExpression) {
		this.cronExpression = cronExpression;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTargetObject() {
		return targetObject;
	}

	public void setTargetObject(String targetObject) {
		this.targetObject = targetObject;
	}

	public String getTargetMethod() {
		return targetMethod;
	}

	public void setTargetMethod(String targetMethod) {
		this.targetMethod = targetMethod;
	}

	public int getIsCluster() {
		return isCluster;
	}

	public void setIsCluster(int isCluster) {
		this.isCluster = isCluster;
	}
    
    
}
