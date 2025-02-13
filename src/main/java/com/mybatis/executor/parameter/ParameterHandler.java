package com.mybatis.executor.parameter;

import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 * @Description: 参数处理器
 * @Author: mingri31164
 * @Date: 2025/2/13 20:17
 **/
public interface ParameterHandler {

    /**
     * 获取参数
     */
    Object getParameterObject();

    /**
     * 设置参数
     */
    void setParameters(PreparedStatement ps) throws SQLException;

}
