package com.mybatis.datasource.pooled;


import com.mybatis.datasource.unpooled.UnpooledDataSourceFactory;

/**
 * @Description: 有连接池的数据源工厂
 * @Author: mingri31164
 * @Date: 2025/2/11 20:24
 **/
public class PooledDataSourceFactory extends UnpooledDataSourceFactory {

    public PooledDataSourceFactory() {
        this.dataSource = new PooledDataSource();
    }

}
