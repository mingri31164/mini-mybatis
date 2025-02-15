package com.mybatis.executor.result;


import com.mybatis.session.ResultContext;

/**
 * @Description: 默认结果上下文
 * @Author: mingri31164
 * @Date: 2025/2/16 4:46
 **/
public class DefaultResultContext implements ResultContext {

    private Object resultObject;
    private int resultCount;

    public DefaultResultContext() {
        this.resultObject = null;
        this.resultCount = 0;
    }

    @Override
    public Object getResultObject() {
        return resultObject;
    }

    @Override
    public int getResultCount() {
        return resultCount;
    }

    public void nextResultObject(Object resultObject) {
        resultCount++;
        this.resultObject = resultObject;
    }

}
