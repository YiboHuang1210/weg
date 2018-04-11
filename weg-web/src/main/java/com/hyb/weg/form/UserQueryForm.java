package com.hyb.weg.form;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by HuangYibo on 2018/4/10.
 */
public class UserQueryForm extends BaseForm {
    /**
     * 用户id
     */
    @ApiModelProperty(value = "用户id")
    private Integer userId;

    /**
     * 用户编号
     */
    @ApiModelProperty(value = "用户编号")
    private String userCode;

    /**
     * 用户姓名
     */
    @ApiModelProperty(value = "用户姓名")
    private String userName;

    /**
     * 用户手机号码
     */
    @ApiModelProperty(value = "用户手机号码")
    private String userPhone;

    /**
     * 查询添加时间开始时间
     */
    @ApiModelProperty(value = "查询添加时间开始时间,格式:yyyy-MM-dd HH:mm:ss")
//    @EqualLength(regexp = ValidUtil.DATEFORMAT, isBlank = true, message = "添加时间开始时间有误")
    private String addStartTimeStr;

    /**
     * 查询添加时间结束时间
     */
    @ApiModelProperty(value = "查询添加时间结束时间,格式:yyyy-MM-dd HH:mm:ss")
//    @EqualLength(regexp = ValidUtil.DATEFORMAT, isBlank = true, message = "添加时间结束时间有误")
    private String addEndTimeStr;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

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

    public String getAddStartTimeStr() {
        return addStartTimeStr;
    }

    public void setAddStartTimeStr(String addStartTimeStr) {
        this.addStartTimeStr = addStartTimeStr;
    }

    public String getAddEndTimeStr() {
        return addEndTimeStr;
    }

    public void setAddEndTimeStr(String addEndTimeStr) {
        this.addEndTimeStr = addEndTimeStr;
    }
}
