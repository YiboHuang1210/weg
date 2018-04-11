package com.hyb.weg.domain.po;

import java.util.Date;

/**
 * Created by HuangYibo on 2018/4/9.
 */
public class UserPO {
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
     * 添加时间
     */
    private Date addTime;

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

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}
