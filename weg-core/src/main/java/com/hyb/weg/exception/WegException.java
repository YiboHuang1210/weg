package com.hyb.weg.exception;

/**
 * 异常
 * Created by HuangYibo on 2018/4/9.
 */
public class WegException extends Exception {

    private static final long serialVersionUID = -6202759931628287239L;

    private static final int DEFAULT_ERROR_CODE = 201;


    /* 错误码,用于返回接口code */
    private int errCode;

    public WegException(){
        super();
    }

    public WegException(String msg) {
        super(msg);
        this.errCode = DEFAULT_ERROR_CODE;
    }
    public WegException(int errCode, String msg) {
        super(msg);
        this.errCode = errCode;
    }

    public WegException(String msg, Throwable e) {
        super(msg,e);
        this.errCode = DEFAULT_ERROR_CODE;
    }

    public WegException(int errCode, String msg, Throwable e) {
        super(msg, e);
        this.errCode = errCode;
    }

    public int getErrCode() {
        return errCode;
    }
}
