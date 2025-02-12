package com.mybatis.builder;


import com.mybatis.session.Configuration;
import com.mybatis.type.TypeAliasRegistry;
import com.mybatis.type.TypeHandlerRegistry;

/**
 * @Description: 构建器的基类，建造者模式
 * @Author: mingri31164
 * @Date: 2025/2/8 22:08
 **/
public abstract class BaseBuilder {

    protected final Configuration configuration;
    protected final TypeAliasRegistry typeAliasRegistry;
    protected final TypeHandlerRegistry typeHandlerRegistry;

    public BaseBuilder(Configuration configuration) {
        this.configuration = configuration;
        this.typeAliasRegistry = this.configuration.getTypeAliasRegistry();
        this.typeHandlerRegistry = this.configuration.getTypeHandlerRegistry();
    }

    public Configuration getConfiguration() {
        return configuration;
    }

    protected Class<?> resolveAlias(String alias) {
        return typeAliasRegistry.resolveAlias(alias);
    }

}
