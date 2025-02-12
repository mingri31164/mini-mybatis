package com.mybatis.builder;

import com.mybatis.mapping.BoundSql;
import com.mybatis.mapping.ParameterMapping;
import com.mybatis.mapping.SqlSource;
import com.mybatis.session.Configuration;

import java.util.List;


/**
 * @Description: 静态SQL源码
 * @Author: mingri31164
 * @Date: 2025/2/12 19:14
 **/
public class StaticSqlSource implements SqlSource {

    private String sql;
    private List<ParameterMapping> parameterMappings;
    private Configuration configuration;

    public StaticSqlSource(Configuration configuration, String sql) {
        this(configuration, sql, null);
    }

    public StaticSqlSource(Configuration configuration, String sql, List<ParameterMapping> parameterMappings) {
        this.sql = sql;
        this.parameterMappings = parameterMappings;
        this.configuration = configuration;
    }

    @Override
    public BoundSql getBoundSql(Object parameterObject) {
        return new BoundSql(configuration, sql, parameterMappings, parameterObject);
    }

}
