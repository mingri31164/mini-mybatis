package com.mybatis.datasource.druid;

import com.mybatis.datasource.DataSourceFactory;
import javax.sql.DataSource;
import java.util.Properties;
import com.alibaba.druid.pool.DruidDataSource;


/**
 * @Description: Druid数据源工厂
 * @Author: mingri31164
 * @Date: 2025/2/9 21:44
 **/
public class DruidDataSourceFactory implements DataSourceFactory {

    private Properties props;

    @Override
    public void setProperties(Properties props) {
        this.props = props;
    }

    @Override
    public DataSource getDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(props.getProperty("driver"));
        dataSource.setUrl(props.getProperty("url"));
        dataSource.setUsername(props.getProperty("username"));
        dataSource.setPassword(props.getProperty("password"));
        return dataSource;
    }

}
