package com.mybatis.mapping;

import com.mybatis.session.Configuration;
import java.util.Map;


/**
 * @Description: 映射语句类
 * @Author: mingri31164
 * @Date: 2025/2/8 22:09
 **/
public class MappedStatement {

    private Configuration configuration;
    private String id;
    private SqlCommandType sqlCommandType;
    private BoundSql boundSql;


    MappedStatement() {
        // constructor disabled
    }

    /**
     * 建造者
     */
    public static class Builder {

        private MappedStatement mappedStatement = new MappedStatement();

        public Builder(Configuration configuration, String id, SqlCommandType sqlCommandType, BoundSql boundSql) {
            mappedStatement.configuration = configuration;
            mappedStatement.id = id;
            mappedStatement.sqlCommandType = sqlCommandType;
            mappedStatement.boundSql = boundSql;
        }

        public MappedStatement build() {
            assert mappedStatement.configuration != null;
            assert mappedStatement.id != null;
            return mappedStatement;
        }

    }

    public Configuration getConfiguration() {
        return configuration;
    }
    public String getId() {
        return id;
    }
    public SqlCommandType getSqlCommandType() {
        return sqlCommandType;
    }
    public BoundSql getBoundSql() {
        return boundSql;
    }



}
