package com.mybatis.mapping;

import com.mybatis.session.Configuration;
import com.mybatis.type.JdbcType;
import com.mybatis.type.TypeHandler;

/**
 * @Description: 结果映射
 * @Author: mingri31164
 * @Date: 2025/2/16 4:50
 **/
public class ResultMapping {

    private Configuration configuration;
    private String property;
    private String column;
    private Class<?> javaType;
    private JdbcType jdbcType;
    private TypeHandler<?> typeHandler;

    ResultMapping() {
    }

    public static class Builder {
        private ResultMapping resultMapping = new ResultMapping();


    }

}
