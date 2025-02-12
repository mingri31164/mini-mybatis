package com.mybatis.mapping;


/**
 * @Description: SQL源码
 * @Author: mingri31164
 * @Date: 2025/2/12 19:14
 **/
public interface SqlSource {

    BoundSql getBoundSql(Object parameterObject);

}
