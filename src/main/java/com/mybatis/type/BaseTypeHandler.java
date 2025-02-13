package com.mybatis.type;

import com.mybatis.session.Configuration;

import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 * @Description: 类型处理器的基类
 * @Author: mingri31164
 * @Date: 2025/2/13 20:21
 **/
public abstract class BaseTypeHandler<T> implements TypeHandler<T> {

    protected Configuration configuration;

    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public void setParameter(PreparedStatement ps, int i, T parameter, JdbcType jdbcType) throws SQLException {
        // 定义抽象方法，由子类实现不同类型的属性设置
        setNonNullParameter(ps, i, parameter, jdbcType);
    }

    protected abstract void setNonNullParameter(PreparedStatement ps, int i, T parameter, JdbcType jdbcType) throws SQLException;

}
