package com.hyb.weg.utils;

import com.hyb.weg.exception.WegException;
import org.apache.commons.lang.StringUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by HuangYibo on 2018/4/10.
 */
public class DateUtil {


    /**
     * 获取格式为yyyy-MM-dd的日期处理类
     *
     * @return
     */
    public static DateFormat getShortDateFormat() {
        return new SimpleDateFormat("yyyy-MM-dd");
    }

    /**
     * 获取格式为yyyy-MM-dd HH:mm:ss的日期处理类
     * @return
     */
    public static DateFormat getFullDateFormat() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }

    /**
     * 转换为日期
     *
     * @param dateStr
     * @param df
     * @return
     */
    public static Date parseDate(String dateStr, DateFormat df) throws WegException {
        if (StringUtils.isBlank(dateStr)) {
            return null;
        }
        try {
            return df.parse(dateStr);
        } catch (ParseException e) {
            throw new WegException(dateStr + ",日期格式有误:" + e.getMessage());
        }
    }
}
