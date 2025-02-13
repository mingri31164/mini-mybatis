package com.mybatis.scripting;

import com.mybatis.executor.parameter.ParameterHandler;
import com.mybatis.mapping.BoundSql;
import com.mybatis.mapping.MappedStatement;
import com.mybatis.mapping.SqlSource;
import org.dom4j.Element;
import com.mybatis.session.Configuration;


/**
 * @Description: 脚本语言驱动
 * @Author: mingri31164
 * @Date: 2025/2/12 19:16
 **/
public interface LanguageDriver {

    /**
     * 创建SQL源码(mapper xml方式)
     */
    SqlSource createSqlSource(Configuration configuration, Element script, Class<?> parameterType);

    /**
     * 创建参数处理器
     */
    ParameterHandler createParameterHandler(MappedStatement mappedStatement, Object parameterObject, BoundSql boundSql);

}
