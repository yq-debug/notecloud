package com.entity;

/**
 * @program: ScheduleService
 * @description: 日尘实体类
 * @create: 2020-01-30 13:08
 **/
public class Schedule {

    public Schedule() {
    }

    public Schedule(String scheduleId, String isNeedRemind) {
        this.scheduleId = scheduleId;
        this.isNeedRemind = isNeedRemind;
    }

    //任务id
    private String scheduleId;
    //账户id
    private String accountId;
    //任务内容
    private String scheduleContent;
    //创建时间
    private String createTime;
    //修改时间
    private String updateTime;
    //执行时间
    private String executeTime;
    //提前时间
    private String aheadTime;
    //是否需要提醒
    private String isNeedRemind;
    //标题
    private String scheduleTitle;
    //发送邮件的时间
    public String remindTime;

    public String getScheduleContent() {
        return scheduleContent;
    }

    public void setScheduleContent(String scheduleContent) {
        this.scheduleContent = scheduleContent;
    }

    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getExecuteTime() {
        return executeTime;
    }

    public void setExecuteTime(String executeTime) {
        this.executeTime = executeTime;
    }

    public String getAheadTime() {
        return aheadTime;
    }

    public void setAheadTime(String aheadTime) {
        this.aheadTime = aheadTime;
    }

    public String getIsNeedRemind() {
        return isNeedRemind;
    }

    public void setIsNeedRemind(String isNeedRemind) {
        this.isNeedRemind = isNeedRemind;
    }

    public String getScheduleTitle() {
        return scheduleTitle;
    }

    public void setScheduleTitle(String scheduleTitle) {
        this.scheduleTitle = scheduleTitle;
    }

    public String getRemindTime() {
        return remindTime;
    }

    public void setRemindTime(String remindTime) {
        this.remindTime = remindTime;
    }
}
