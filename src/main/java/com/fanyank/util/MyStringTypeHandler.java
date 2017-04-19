package com.fanyank.util;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by yanfeng-mac on 2017/4/19.
 */
@MappedTypes({String.class})
@MappedJdbcTypes(JdbcType.VARCHAR)
public class MyStringTypeHandler implements TypeHandler<String>{

    public void setParameter(PreparedStatement preparedStatement, int i, String s, JdbcType jdbcType) throws SQLException {
        System.out.println("使用我的StringTypeHandler");
        preparedStatement.setString(i,s);
    }

    public String getResult(ResultSet resultSet, String s) throws SQLException {
        System.out.println("使用我的StringTypeHandler,ResultSet列名获取字符串");
        return resultSet.getString(s);
    }

    public String getResult(ResultSet resultSet, int i) throws SQLException {
        System.out.println("使用我的StringTypeHandler,ResultSet下标index获取字符串");
        return resultSet.getString(i);
    }

    public String getResult(CallableStatement callableStatement, int i) throws SQLException {
        System.out.println("使用我的StringTypeHandler,CallableStatement下标index获取字符串");
        return callableStatement.getString(i);
    }
}
