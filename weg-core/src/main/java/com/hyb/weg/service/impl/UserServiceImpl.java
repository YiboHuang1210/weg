package com.hyb.weg.service.impl;

import com.hyb.weg.dao.UserMapper;
import com.hyb.weg.domain.condition.UserCondition;
import com.hyb.weg.domain.po.UserPO;
import org.springframework.stereotype.Service;

/**
 * Created by HuangYibo on 2018/4/10.
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<UserPO, UserCondition, UserMapper> {
}
