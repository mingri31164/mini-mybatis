package com.mybatis.reflection.invoker;

import java.lang.reflect.Field;


/**
 * @Description: setter 调用者
 * @Author: mingri31164
 * @Date: 2025/2/11 20:50
 **/
public class SetFieldInvoker implements Invoker {

    private Field field;

    public SetFieldInvoker(Field field) {
        this.field = field;
    }

    @Override
    public Object invoke(Object target, Object[] args) throws Exception {
        field.set(target, args[0]);
        return null;
    }

    @Override
    public Class<?> getType() {
        return field.getType();
    }

}