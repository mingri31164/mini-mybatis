package com.mybatis.reflection.wrapper;

import com.mybatis.reflection.MetaObject;


/**
 * @Description: 对象包装工厂
 * @Author: mingri31164
 * @Date: 2025/2/11 20:53
 **/
public interface ObjectWrapperFactory {

    /**
     * 判断有没有包装器
     */
    boolean hasWrapperFor(Object object);

    /**
     * 得到包装器
     */
    ObjectWrapper getWrapperFor(MetaObject metaObject, Object object);

}
