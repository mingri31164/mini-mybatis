package com.mybatis.transaction.jdbc;

import com.mybatis.session.TransactionIsolationLevel;
import com.mybatis.transaction.Transaction;
import com.mybatis.transaction.TransactionFactory;

import javax.sql.DataSource;
import java.sql.Connection;


/**
 * @Description: JdbcTransaction 工厂
 * @Author: mingri31164
 * @Date: 2025/2/9 21:56
 **/
public class JdbcTransactionFactory implements TransactionFactory {

    @Override
    public Transaction newTransaction(Connection conn) {
        return new JdbcTransaction(conn);
    }

    @Override
    public Transaction newTransaction(DataSource dataSource, TransactionIsolationLevel level, boolean autoCommit) {
        return new JdbcTransaction(dataSource, level, autoCommit);
    }

}
