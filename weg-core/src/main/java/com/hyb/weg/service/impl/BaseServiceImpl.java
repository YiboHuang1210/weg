package com.hyb.weg.service.impl;

import com.hyb.weg.dao.BaseMapper;
import com.hyb.weg.domain.condition.BaseCondition;
import com.hyb.weg.exception.WegException;
import com.hyb.weg.service.BaseService;
import com.hyb.weg.utils.PageHelperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by HuangYibo on 2018/4/9.
 * @param <T> 服务层的PO对象
 * @param <C> 服务层的条件对象
 * @param <M> 数据库的mapper接口
*/
public abstract class BaseServiceImpl<T,C extends BaseCondition,M extends BaseMapper<T, C>> implements BaseService<T,C> {

    @Autowired(required=false)
    protected M mapper;

    @Override
    public T query(Object id) {
        T o = mapper.select(id);
        return o;
    }

    @Override
    public T queryName(Object name) {
        T o = mapper.selectName(name);
        return o;
    }

    @Override
    public T queryWithValid(Object id) throws WegException {
        T o = mapper.select(id);
        if (o == null){
            throw new WegException(id + "对应的记录为空");
        }
        return o;
    }

    @Override
    public List<T> queryList(C condition) {
        PageHelperUtil.startPage(condition.getPageNo(),condition.getPageSize());
        List<T> list = mapper.selectList(condition);
        return list;
    }

    @Override
    public int queryCount(C condition) {
        PageHelperUtil.startPage(0, 0);
        return mapper.count(condition);
    }


    @Override
    @Transactional(rollbackFor = {Exception.class})
    public int update(T po) {
        int row = mapper.update(po);
        return row;
    }

    @Override
    @Transactional(rollbackFor = {Exception.class})
    public void updateWithValid(T po) throws WegException {
        int row = mapper.update(po);
        if (row == 0) {
            throw new WegException("修改失败");
        }
    }

    @Override
    @Transactional(rollbackFor = {Exception.class})
    public void insert(T po) {
        mapper.insert(po);
    }

    @Override
    @Transactional(rollbackFor = {Exception.class})
    public void delete(Object id) {
        mapper.delete(id);
    }

    /**
     * 返回对应的Mapper
     * @return
     */
    protected M getMapper() {
        return mapper;
    }
}
