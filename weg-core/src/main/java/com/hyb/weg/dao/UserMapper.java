package com.hyb.weg.dao;

import com.hyb.weg.domain.condition.UserCondition;
import com.hyb.weg.domain.po.UserPO;
import org.springframework.stereotype.Repository;

/**
 * Created by HuangYibo on 2018/4/9.
 */
@Repository
public interface UserMapper extends BaseMapper<UserPO,UserCondition> {
}
