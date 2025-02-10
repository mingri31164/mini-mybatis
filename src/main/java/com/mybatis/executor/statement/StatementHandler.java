package com.mybatis.executor.statement;

import com.mybatis.session.ResultHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


/**
 * @Description: 语句处理器
 * @Author: mingri31164
 * @Date: 2025/2/10 18:38
 **/
public interface StatementHandler {

    /** 准备语句 */
    Statement prepare(Connection connection) throws SQLException;

    /** 参数化 */
    void parameterize(Statement statement) throws SQLException;

    /** 执行查询 */
    <E> List<E> query(Statement statement, ResultHandler resultHandler) throws SQLException;

}
