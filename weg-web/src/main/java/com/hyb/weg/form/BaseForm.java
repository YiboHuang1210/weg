package com.hyb.weg.form;

import java.util.List;

/**
 * Created by HuangYibo on 2018/4/10.
 */
public class BaseForm {

//    @ApiModelProperty("分页每页条数")
    public Integer pageSize = 20;

//    @ApiModelProperty("分页页码")
    public Integer pageNo = 0;

//    @ApiModelProperty(value = "排序字段")
    public List<SortInfo> sortInfos;
    public Integer getPageSize() {
        return pageSize;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BaseForm{");
        sb.append("pageSize=").append(pageSize);
        sb.append(", pageNo=").append(pageNo);
        sb.append('}');
        return sb.toString();
    }
}
