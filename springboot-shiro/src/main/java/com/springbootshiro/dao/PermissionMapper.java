package com.springbootshiro.dao;

import com.springbootshiro.domain.Permission;
import com.springbootshiro.domain.PermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface PermissionMapper {
    @SelectProvider(type=PermissionSqlProvider.class, method="countByExample")
    long countByExample(PermissionExample example);

    @DeleteProvider(type=PermissionSqlProvider.class, method="deleteByExample")
    int deleteByExample(PermissionExample example);

    @Insert({
        "insert into sys_permission (id, parent_id, ",
        "res_name, res_type, ",
        "permission, url)",
        "values (#{id,jdbcType=BIGINT}, #{parentId,jdbcType=BIGINT}, ",
        "#{resName,jdbcType=VARCHAR}, #{resType,jdbcType=VARCHAR}, ",
        "#{permission,jdbcType=VARCHAR}, #{url,jdbcType=VARCHAR})"
    })
    int insert(Permission record);

    @InsertProvider(type=PermissionSqlProvider.class, method="insertSelective")
    int insertSelective(Permission record);

    @SelectProvider(type=PermissionSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT),
        @Result(column="parent_id", property="parentId", jdbcType=JdbcType.BIGINT),
        @Result(column="res_name", property="resName", jdbcType=JdbcType.VARCHAR),
        @Result(column="res_type", property="resType", jdbcType=JdbcType.VARCHAR),
        @Result(column="permission", property="permission", jdbcType=JdbcType.VARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR)
    })
    List<Permission> selectByExample(PermissionExample example);

    @UpdateProvider(type=PermissionSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Permission record, @Param("example") PermissionExample example);

    @UpdateProvider(type=PermissionSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Permission record, @Param("example") PermissionExample example);
}