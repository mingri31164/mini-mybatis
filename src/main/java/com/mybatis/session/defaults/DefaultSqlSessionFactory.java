package com.mybatis.session.defaults;

import com.mybatis.binding.MapperRegistry;
import com.mybatis.session.SqlSession;
import com.mybatis.session.SqlSessionFactory;


/**
 * @Description: 默认的 DefaultSqlSessionFactory
 * @Author: mingri31164
 * @Date: 2025/2/7 22:40
 **/
public class DefaultSqlSessionFactory implements SqlSessionFactory {

    private final MapperRegistry mapperRegistry;

    public DefaultSqlSessionFactory(MapperRegistry mapperRegistry) {
        this.mapperRegistry = mapperRegistry;
    }

    @Override
    public SqlSession openSession() {
        return new DefaultSqlSession(mapperRegistry);
    }

}
