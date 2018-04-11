package com.hyb.weg.domain.condition;

import java.util.Date;

/**
 * Created by HuangYibo on 2018/4/9.
 */
public class UserCondition extends BaseCondition {
    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 用户编号
     */
    private String userCode;

    /**
     * 用户姓名
     */
    private String userName;

    /**
     * 用户手机号码
     */
    private String userPhone;

    /**
     * 查询添加时间开始时间
     */
    private Date addStartTime;

    /**
     * 查询添加时间结束时间
     */
    private Date addEndTime;

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getAddStartTime() {
        return addStartTime;
    }

    public void setAddStartTime(Date addStartTime) {
        this.addStartTime = addStartTime;
    }

    public Date getAddEndTime() {
        return addEndTime;
    }

    public void setAddEndTime(Date addEndTime) {
        this.addEndTime = addEndTime;
    }
}
