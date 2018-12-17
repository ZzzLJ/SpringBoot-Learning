package com.springbootmybatis.handler;

import org.apache.ibatis.type.*;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
* Mybatis EnumTypeHandler自定义统一处理器
* */
@MappedJdbcTypes(value = {})
public class BaseEnumTypeHandler<E extends Enum<E>> extends BaseTypeHandler<E> {
    private Enum<E> type;

    public BaseEnumTypeHandler(Enum<E> type) {
        this.type = type;
    }

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, E e, JdbcType jdbcType) throws SQLException {

    }

    @Override
    public E getNullableResult(ResultSet resultSet, String s) throws SQLException {
        return null;
    }

    @Override
    public E getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return null;
    }

    @Override
    public E getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return null;
    }
}
