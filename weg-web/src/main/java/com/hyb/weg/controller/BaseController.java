package com.hyb.weg.controller;

import java.util.Collections;
import java.util.Map;
import com.hyb.weg.utils.JSONUtil;

/**
 * Created by HuangYibo on 2018/4/9.
 */
public class BaseController {

    /**
     * 失败的Status Code.
     */
    private static final int RESCODE_FAIL = 201;
    /**
     * 成功的Status Code.
     */
    private static final int RESCODE_OK = 200;

    /**
     * 获取失败信息.
     * @param msg
     * @return
     */
    protected Map<String, Object> failResult(String msg) {
        return JSONUtil.createJson(false, RESCODE_FAIL, msg, Collections.EMPTY_MAP);
    }

    /**
     * 获取失败信息.
     * @param msg
     * @return
     */
    protected Map<String, Object> failResult(int errCode,String msg) {
        return JSONUtil.createJson(false, errCode, msg, Collections.EMPTY_MAP);
    }

    /**
     * 获取默认ajax成功信息.
     * @return
     */
    protected Map<String, Object> successResult() {
        return successResult("操作成功！");
    }

    /**
     * 获取含有Data的ajax成功信息.
     * 只返回数据，默认操作信息为操作成功
     * @param obj
     * @return
     */
    protected Map<String, Object> successDataResult(Object obj) {
        return JSONUtil.createJson(true, RESCODE_OK, "操作成功", obj);
    }

    /**
     * 获取ajax成功信息.
     * @return
     */
    protected Map<String, Object> successResult(String msg) {
        return JSONUtil.createJson(true, RESCODE_OK, msg, Collections.EMPTY_MAP);
    }

}
