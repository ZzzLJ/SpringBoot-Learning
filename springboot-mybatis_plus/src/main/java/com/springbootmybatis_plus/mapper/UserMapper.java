package com.springbootmybatis_plus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.springbootmybatis_plus.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper extends BaseMapper<User>{
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertTest(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}