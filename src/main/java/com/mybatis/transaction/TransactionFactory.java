package com.mybatis.transaction;


import com.mybatis.session.TransactionIsolationLevel;
import javax.sql.DataSource;
import java.sql.Connection;


/**
 * @Description: 事务工厂
 * @Author: mingri31164
 * @Date: 2025/2/9 21:56
 **/
public interface TransactionFactory {

    /**
     * 根据 Connection 创建 Transaction
     * @param conn Existing database connection
     * @return Transaction
     */
    Transaction newTransaction(Connection conn);

    /**
     * 根据数据源和事务隔离级别创建 Transaction
     * @param dataSource DataSource to take the connection from
     * @param level Desired isolation level
     * @param autoCommit Desired autocommit
     * @return Transaction
     */
    Transaction newTransaction(DataSource dataSource, TransactionIsolationLevel level, boolean autoCommit);

}
