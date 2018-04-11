package com.hyb.weg.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by HuangYibo on 2018/4/10.
 */
public class JSONUtil {

    /**
     * 组装json格式返回结果
     * @param isOk
     * @param resCode
     * @param errorMsg
     * @param obj
     * @return
     */
    public static Map<String, Object> createJson(boolean isOk, int resCode, String errorMsg, Object obj) {
        Map<String, Object> jsonMap = new HashMap<String, Object>();
        jsonMap.put("result", isOk ? "ok" : "fail");
        jsonMap.put("rescode", resCode);
        jsonMap.put("msg", errorMsg);
        jsonMap.put("data", obj);
        return jsonMap;
    }
}
