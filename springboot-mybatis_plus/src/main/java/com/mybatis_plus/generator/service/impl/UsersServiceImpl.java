package com.mybatis_plus.generator.service.impl;

import com.mybatis_plus.generator.entity.Users;
import com.mybatis_plus.generator.mapper.UsersMapper;
import com.mybatis_plus.generator.service.IUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 * @author ZzzLJ
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {

}
