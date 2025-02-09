package com.mybatis.datasource.pooled;


import com.mybatis.datasource.unpooled.UnpooledDataSourceFactory;

import javax.sql.DataSource;


/**
 * @Description: 有连接池的数据源工厂
 * @Author: mingri31164
 * @Date: 2025/2/9 22:53
 **/
public class PooledDataSourceFactory extends UnpooledDataSourceFactory {

    @Override
    public DataSource getDataSource() {
        PooledDataSource pooledDataSource = new PooledDataSource();
        pooledDataSource.setDriver(props.getProperty("driver"));
        pooledDataSource.setUrl(props.getProperty("url"));
        pooledDataSource.setUsername(props.getProperty("username"));
        pooledDataSource.setPassword(props.getProperty("password"));
        return pooledDataSource;
    }

}
