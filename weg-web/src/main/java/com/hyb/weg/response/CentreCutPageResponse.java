package com.hyb.weg.response;

/**
 * Created by HuangYibo on 2018/4/10.
 */
public class CentreCutPageResponse<T> extends CentreListResponse<T> {
    private static final long serialVersionUID = 5888709607809204814L;
    private int totalCount;
    private int pageNum;
    private int pageSize;

    public CentreCutPageResponse() {
    }

    public int getTotalCount() {
        return this.totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getPageNum() {
        return this.pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
