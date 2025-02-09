package com.mybatis.datasource.unpooled;


import com.mybatis.datasource.DataSourceFactory;

import javax.sql.DataSource;
import java.util.Properties;


/**
 * @Description: 无池化数据源工厂
 * @Author: mingri31164
 * @Date: 2025/2/9 22:54
 **/
public class UnpooledDataSourceFactory implements DataSourceFactory {

    protected Properties props;

    @Override
    public void setProperties(Properties props) {
        this.props = props;
    }

    @Override
    public DataSource getDataSource() {
        UnpooledDataSource unpooledDataSource = new UnpooledDataSource();
        unpooledDataSource.setDriver(props.getProperty("driver"));
        unpooledDataSource.setUrl(props.getProperty("url"));
        unpooledDataSource.setUsername(props.getProperty("username"));
        unpooledDataSource.setPassword(props.getProperty("password"));
        return unpooledDataSource;
    }

}
