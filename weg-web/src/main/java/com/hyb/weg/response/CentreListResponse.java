package com.hyb.weg.response;

import java.util.List;

/**
 * Created by HuangYibo on 2018/4/10.
 */
public class CentreListResponse<T> extends CentreSerializable {
    private static final long serialVersionUID = -7628952830016632166L;
    private List<T> dataList;

    public CentreListResponse() {
    }

    public List<T> getDataList() {
        return this.dataList;
    }

    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }
}