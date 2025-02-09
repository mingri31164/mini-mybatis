package com.mybatis.transaction;

import java.sql.Connection;
import java.sql.SQLException;


/**
 * @Description: 事务接口
 * @Author: mingri31164
 * @Date: 2025/2/9 21:56
 **/
public interface Transaction {

    Connection getConnection() throws SQLException;

    void commit() throws SQLException;

    void rollback() throws SQLException;

    void close() throws SQLException;

}
