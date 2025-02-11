package com.mybatis.reflection.invoker;

import java.lang.reflect.Field;


/**
 * @Description: getter 调用者
 * @Author: mingri31164
 * @Date: 2025/2/11 20:50
 **/
public class GetFieldInvoker implements Invoker {

    private Field field;

    public GetFieldInvoker(Field field) {
        this.field = field;
    }

    @Override
    public Object invoke(Object target, Object[] args) throws Exception {
        return field.get(target);
    }

    @Override
    public Class<?> getType() {
        return field.getType();
    }

}
