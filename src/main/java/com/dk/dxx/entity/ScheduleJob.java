package com.dk.dxx.entity;

/**
 * �������quartz��ݿ⶯̬����
 * 
 * @author dxx
 *
 */
public class ScheduleJob {

	private String jobId; // ���� ID
    private String jobName; // �������
    private String jobGroup; // �������
    private String cronExpression; // ʱ����ʽ
    private String description; // ��������

    private String targetObject; // Spring ע�������
    private String targetMethod; // ����

    private int isCluster;// �Ƿ�Ⱥ����

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
