package com.mybatis.reflection.wrapper;

import com.mybatis.reflection.MetaObject;


/**
 * @Description: 默认对象包装工厂
 * @Author: mingri31164
 * @Date: 2025/2/11 20:52
 **/
public class DefaultObjectWrapperFactory implements ObjectWrapperFactory{

    @Override
    public boolean hasWrapperFor(Object object) {
        return false;
    }

    @Override
    public ObjectWrapper getWrapperFor(MetaObject metaObject, Object object) {
        throw new RuntimeException("The DefaultObjectWrapperFactory should never be called to provide an ObjectWrapper.");
    }

}
