package com.mybatis.session;


/**
 * @Description: 结果处理器
 * @Author: mingri31164
 * @Date: 2025/2/10 18:30
 **/
public interface ResultHandler {

    /**
     * 处理结果
     */
    void handleResult(ResultContext context);

}
