package com.mybatis.test;

import com.mybatis.io.Resources;
import com.mybatis.session.SqlSession;
import com.mybatis.session.SqlSessionFactory;
import com.mybatis.session.SqlSessionFactoryBuilder;
import com.mybatis.test.dao.IUserDao;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.Reader;


public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_MapperProxyFactory() {
        // 1. 从SqlSessionFactory中获取SqlSession
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader("mybatis-config-datasource.xml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 2. 获取映射器对象
        IUserDao userDao = sqlSession.getMapper(IUserDao.class);

        // 3. 测试验证
        String res = userDao.queryUserInfoById("10001");
        logger.info("测试结果：{}", res);
    }

}