package com.mybatis.scripting;

import com.mybatis.mapping.SqlSource;
import org.dom4j.Element;
import com.mybatis.session.Configuration;


/**
 * @Description: 脚本语言驱动
 * @Author: mingri31164
 * @Date: 2025/2/12 19:16
 **/
public interface LanguageDriver {

    SqlSource createSqlSource(Configuration configuration, Element script, Class<?> parameterType);

}
