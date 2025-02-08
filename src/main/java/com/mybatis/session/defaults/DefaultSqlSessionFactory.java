package com.mybatis.session.defaults;

import com.mybatis.session.Configuration;
import com.mybatis.session.SqlSession;
import com.mybatis.session.SqlSessionFactory;


/**
 * @Description: 默认的 DefaultSqlSessionFactory
 * @Author: mingri31164
 * @Date: 2025/2/7 22:40
 **/
public class DefaultSqlSessionFactory implements SqlSessionFactory {

    private final Configuration configuration;

    public DefaultSqlSessionFactory(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public SqlSession openSession() {
        return new DefaultSqlSession(configuration);
    }

}
