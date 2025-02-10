package com.mybatis.executor;

import com.mybatis.executor.statement.StatementHandler;
import com.mybatis.mapping.BoundSql;
import com.mybatis.mapping.MappedStatement;
import com.mybatis.session.Configuration;
import com.mybatis.session.ResultHandler;
import com.mybatis.transaction.Transaction;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


/**
 * @Description: 简单执行器
 * @Author: mingri31164
 * @Date: 2025/2/10 18:39
 **/
public class SimpleExecutor extends BaseExecutor {

    public SimpleExecutor(Configuration configuration, Transaction transaction) {
        super(configuration, transaction);
    }

    @Override
    protected <E> List<E> doQuery(MappedStatement ms, Object parameter, ResultHandler resultHandler, BoundSql boundSql) {
        try {
            Configuration configuration = ms.getConfiguration();
            StatementHandler handler = configuration.newStatementHandler(this, ms, parameter, resultHandler, boundSql);
            Connection connection = transaction.getConnection();
            Statement stmt = handler.prepare(connection);
            handler.parameterize(stmt);
            return handler.query(stmt, resultHandler);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

}
