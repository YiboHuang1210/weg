package com.hyb.weg.utils;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

/**
 * Created by huangyibo on 2017/4/10.
 */
public class PageHelperUtil {

    public static <E> Page<E> startPage(int pageNo, int pageSize) {
        return PageHelper.startPage(pageNo + 1, pageSize);
    }
}
