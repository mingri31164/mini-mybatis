package com.mybatis.type;

import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 * @Description: Long类型处理器
 * @Author: mingri31164
 * @Date: 2025/2/13 20:21
 **/
public class LongTypeHandler extends BaseTypeHandler<Long> {

    @Override
    protected void setNonNullParameter(PreparedStatement ps, int i, Long parameter, JdbcType jdbcType) throws SQLException {
        ps.setLong(i, parameter);
    }

}
