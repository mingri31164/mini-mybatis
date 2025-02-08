package com.mybatis.mapping;


/**
 * @Description: 指令类型
 * @Author: mingri31164
 * @Date: 2025/2/8 22:09
 **/
public enum SqlCommandType {

    /**
     * 未知
     */
    UNKNOWN,
    /**
     * 插入
     */
    INSERT,
    /**
     * 更新
     */
    UPDATE,
    /**
     * 删除
     */
    DELETE,
    /**
     * 查找
     */
    SELECT;

}
