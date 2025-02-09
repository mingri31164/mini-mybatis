package com.mybatis.datasource;

import javax.sql.DataSource;
import java.util.Properties;


/**
 * @Description: 数据源工厂
 * @Author: mingri31164
 * @Date: 2025/2/9 21:44
 **/
public interface DataSourceFactory {

    void setProperties(Properties props);

    DataSource getDataSource();

}
