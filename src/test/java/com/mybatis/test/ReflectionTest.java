package com.mybatis.test;

import com.alibaba.fastjson.JSON;
import com.mybatis.reflection.MetaObject;
import com.mybatis.reflection.SystemMetaObject;
import com.mybatis.test.pojo.Teacher;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;


/**
 * @Description: 反射类测试
 * @Author: mingri31164
 * @Date: 2025/2/11 20:55
 **/
public class ReflectionTest {

    private Logger logger = LoggerFactory.getLogger(ReflectionTest.class);

    @Test
    public void test_reflection() {
        Teacher teacher = new Teacher();
        List<Teacher.Student> list = new ArrayList<>();
        list.add(new Teacher.Student());
        teacher.setName("test");
        teacher.setStudents(list);

        MetaObject metaObject = SystemMetaObject.forObject(teacher);

        logger.info("getGetterNames：{}", JSON.toJSONString(metaObject.getGetterNames()));
        logger.info("getSetterNames：{}", JSON.toJSONString(metaObject.getSetterNames()));
        logger.info("name的get方法返回值：{}", JSON.toJSONString(metaObject.getGetterType("name")));
        logger.info("students的set方法参数值：{}", JSON.toJSONString(metaObject.getGetterType("students")));
        logger.info("name的hasGetter：{}", metaObject.hasGetter("name"));
        logger.info("student.id（属性为对象）的hasGetter：{}", metaObject.hasGetter("student.id"));
        logger.info("获取name的属性值：{}", metaObject.getValue("name"));
        // 重新设置属性值
        metaObject.setValue("name", "小白");
        logger.info("设置name的属性值：{}", metaObject.getValue("name"));
        // 设置属性（集合）的元素值
        metaObject.setValue("students[0].id", "001");
        logger.info("获取students集合的第一个元素的属性值：{}", JSON.toJSONString(metaObject.getValue("students[0].id")));
        logger.info("对象的序列化：{}", JSON.toJSONString(teacher));
    }

}
