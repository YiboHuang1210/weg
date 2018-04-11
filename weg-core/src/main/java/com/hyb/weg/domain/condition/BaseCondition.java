package com.hyb.weg.domain.condition;


public class BaseCondition {

    private int pageSize = Integer.MAX_VALUE;

    private int pageNo;

    private int skipResults = 0;

    private String orderBy;

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
        skipResults = pageSize * pageNo;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
        skipResults = pageSize * pageNo;
    }

    public int getSkipResults() {
        return skipResults;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }


    /*
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
    */
}
