package com.wyu.test.service.impl;

import com.wyu.test.po.Role;
import com.wyu.test.mapper.RoleMapper;
import com.wyu.test.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author ZzzLJ
 * @Description
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
