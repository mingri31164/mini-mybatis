package com.mybatis.session;

/**
 * @Description: SqlSession 用来执行SQL，获取映射器，管理事务。
 * @Author: mingri31164
 * @Date: 2025/2/7 22:41
 **/
public interface SqlSession {

    /**
     * Retrieve a single row mapped from the statement key
     * 根据指定的SqlID获取一条记录的封装对象
     */
    <T> T selectOne(String statement);

    /**
     * Retrieve a single row mapped from the statement key and parameter.
     * 根据指定的SqlID获取一条记录的封装对象，只不过这个方法容许我们可以给sql传递一些参数
     * 一般在实际使用中，这个参数传递的是pojo，或者Map或者ImmutableMap
     */
    <T> T selectOne(String statement, Object parameter);

    /**
     * Retrieves a mapper.
     * 得到映射器，这个巧妙的使用了泛型，使得类型安全
     */
    <T> T getMapper(Class<T> type);

}
