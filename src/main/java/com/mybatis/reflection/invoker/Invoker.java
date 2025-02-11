package com.mybatis.reflection.invoker;


/**
 * @Description: 调用者
 * @Author: mingri31164
 * @Date: 2025/2/11 20:50
 **/
public interface Invoker {

    Object invoke(Object target, Object[] args) throws Exception;

    Class<?> getType();

}
