package com.mybatis.session;


/**
 * @Description: 结果上下文
 * @Author: mingri31164
 * @Date: 2025/2/16 4:52
 **/
public interface ResultContext {

    /**
     * 获取结果
     */
    Object getResultObject();

    /**
     * 获取记录数
     */
    int getResultCount();

}
