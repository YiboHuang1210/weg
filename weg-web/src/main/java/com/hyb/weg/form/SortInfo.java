package com.hyb.weg.form;

/**
 * Created by HuangYibo on 2018/4/10.
 */
public class SortInfo {
    public String field;

    public String sort;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SortInfo{");
        sb.append("field='").append(field).append('\'');
        sb.append(", sort='").append(sort).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
