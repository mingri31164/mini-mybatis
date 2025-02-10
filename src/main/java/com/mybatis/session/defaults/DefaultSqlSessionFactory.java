package com.mybatis.session.defaults;

import com.mybatis.executor.Executor;
import com.mybatis.mapping.Environment;
import com.mybatis.session.Configuration;
import com.mybatis.session.SqlSession;
import com.mybatis.session.SqlSessionFactory;
import com.mybatis.session.TransactionIsolationLevel;
import com.mybatis.transaction.Transaction;
import com.mybatis.transaction.TransactionFactory;

import java.sql.SQLException;


/**
 * @Description: 默认的 DefaultSqlSessionFactory
 * @Author: mingri31164
 * @Date: 2025/2/7 22:40
 **/
public class DefaultSqlSessionFactory implements SqlSessionFactory {

    private final Configuration configuration;

    public DefaultSqlSessionFactory(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public SqlSession openSession() {
        Transaction tx = null;
        try {
            final Environment environment = configuration.getEnvironment();
            TransactionFactory transactionFactory = environment.getTransactionFactory();
            tx = transactionFactory.newTransaction(configuration.getEnvironment().getDataSource(), TransactionIsolationLevel.READ_COMMITTED, false);
            // 创建执行器
            final Executor executor = configuration.newExecutor(tx);
            // 创建DefaultSqlSession
            return new DefaultSqlSession(configuration, executor);
        } catch (Exception e) {
            try {
                assert tx != null;
                tx.close();
            } catch (SQLException ignore) {
            }
            throw new RuntimeException("Error opening session.  Cause: " + e);
        }
    }

}
