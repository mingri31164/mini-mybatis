package com.mybatis.builder;


import com.mybatis.session.Configuration;

/**
 * @Description: 构建器的基类，建造者模式
 * @Author: mingri31164
 * @Date: 2025/2/8 22:08
 **/
public abstract class BaseBuilder {

    protected final Configuration configuration;

    public BaseBuilder(Configuration configuration) {
        this.configuration = configuration;
    }

    public Configuration getConfiguration() {
        return configuration;
    }

}
