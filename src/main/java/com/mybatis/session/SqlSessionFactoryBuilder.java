package com.mybatis.session;

import com.mybatis.builder.xml.XMLConfigBuilder;
import com.mybatis.session.defaults.DefaultSqlSessionFactory;

import java.io.Reader;


/**
 * @Description: 构建SqlSessionFactory的工厂
 * @Author: mingri31164
 * @Date: 2025/2/8 22:10
 **/
public class SqlSessionFactoryBuilder {

    public SqlSessionFactory build(Reader reader) {
        XMLConfigBuilder xmlConfigBuilder = new XMLConfigBuilder(reader);
        return build(xmlConfigBuilder.parse());
    }

    public SqlSessionFactory build(Configuration config) {
        return new DefaultSqlSessionFactory(config);
    }

}