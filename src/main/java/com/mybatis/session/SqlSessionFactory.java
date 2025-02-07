package com.mybatis.session;

/**
 * @Description: 工厂模式接口，构建SqlSession的工厂
 * @Author: mingri31164
 * @Date: 2025/2/7 22:41
 **/
public interface SqlSessionFactory {

    /**
     * 打开一个 session
     * @return SqlSession
     */
   SqlSession openSession();

}
