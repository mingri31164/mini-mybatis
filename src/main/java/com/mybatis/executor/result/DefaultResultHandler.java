package com.mybatis.executor.result;

import com.mybatis.reflection.factory.ObjectFactory;
import com.mybatis.session.ResultContext;
import com.mybatis.session.ResultHandler;

import java.util.ArrayList;
import java.util.List;


/**
 * @Description: 默认结果处理器
 * @Author: mingri31164
 * @Date: 2025/2/16 4:46
 **/
public class DefaultResultHandler implements ResultHandler {

    private final List<Object> list;

    public DefaultResultHandler() {
        this.list = new ArrayList<>();
    }

    /**
     * 通过 ObjectFactory 反射工具类，产生特定的 List
     */
    @SuppressWarnings("unchecked")
    public DefaultResultHandler(ObjectFactory objectFactory) {
        this.list = objectFactory.create(List.class);
    }

    @Override
    public void handleResult(ResultContext context) {
        list.add(context.getResultObject());
    }

    public List<Object> getResultList() {
        return list;
    }

}
