package com.mybatis.test;

import com.alibaba.fastjson.JSON;
import com.mybatis.io.Resources;
import com.mybatis.session.SqlSession;
import com.mybatis.session.SqlSessionFactory;
import com.mybatis.session.SqlSessionFactoryBuilder;
import com.mybatis.test.dao.IUserDao;
import com.mybatis.test.pojo.User;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;


public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_SqlSessionFactory() throws IOException {
        // 1. 从SqlSessionFactory中获取SqlSession
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config-datasource.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 2. 获取映射器对象
        IUserDao userDao = sqlSession.getMapper(IUserDao.class);

        // 3. 测试验证
        for (int i = 0; i < 50; i++) {
            User user = userDao.queryUserInfoById(1L);
            logger.info("测试结果：{}", JSON.toJSONString(user));
        }
    }




}