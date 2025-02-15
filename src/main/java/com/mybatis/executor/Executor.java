package com.mybatis.executor;

import com.mybatis.mapping.BoundSql;
import com.mybatis.mapping.MappedStatement;
import com.mybatis.session.ResultHandler;
import com.mybatis.session.RowBounds;
import com.mybatis.transaction.Transaction;

import java.sql.SQLException;
import java.util.List;


/**
 * @Description: 执行器
 * @Author: mingri31164
 * @Date: 2025/2/10 18:39
 **/
public interface Executor {

    ResultHandler NO_RESULT_HANDLER = null;

    <E> List<E> query(MappedStatement ms, Object parameter, RowBounds rowBounds, ResultHandler resultHandler, BoundSql boundSql);

    Transaction getTransaction();

    void commit(boolean required) throws SQLException;

    void rollback(boolean required) throws SQLException;

    void close(boolean forceRollback);

}