package com.mybatis.scripting.defaults;

import com.mybatis.builder.SqlSourceBuilder;
import com.mybatis.mapping.BoundSql;
import com.mybatis.mapping.SqlSource;
import com.mybatis.scripting.xmltags.DynamicContext;
import com.mybatis.scripting.xmltags.SqlNode;
import com.mybatis.session.Configuration;
import ognl.OgnlContext;
import ognl.OgnlException;
import ognl.OgnlRuntime;
import ognl.PropertyAccessor;

import java.util.HashMap;
import java.util.Map;
import java.util.HashMap;


/**
 * @Description: 原始SQL源码，比 DynamicSqlSource 动态SQL处理快
 * @Author: mingri31164
 * @Date: 2025/2/12 19:15
 **/
public class RawSqlSource implements SqlSource {

    private final SqlSource sqlSource;

    public RawSqlSource(Configuration configuration, SqlNode rootSqlNode, Class<?> parameterType) {
        this(configuration, getSql(configuration, rootSqlNode), parameterType);
    }

    public RawSqlSource(Configuration configuration, String sql, Class<?> parameterType) {
        SqlSourceBuilder sqlSourceParser = new SqlSourceBuilder(configuration);
        Class<?> clazz = parameterType == null ? Object.class : parameterType;
        sqlSource = sqlSourceParser.parse(sql, clazz, new HashMap<>());
    }

    @Override
    public BoundSql getBoundSql(Object parameterObject) {
        return sqlSource.getBoundSql(parameterObject);
    }

    private static String getSql(Configuration configuration, SqlNode rootSqlNode) {
        DynamicContext context = new DynamicContext(configuration, null);
        rootSqlNode.apply(context);
        return context.getSql();
    }

}
