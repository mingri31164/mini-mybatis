package com.mybatis.executor.resultset;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


/**
 * @Description: 结果集处理器
 * @Author: mingri31164
 * @Date: 2025/2/10 18:37
 **/
public interface ResultSetHandler {

    <E> List<E> handleResultSets(Statement stmt) throws SQLException;

}
