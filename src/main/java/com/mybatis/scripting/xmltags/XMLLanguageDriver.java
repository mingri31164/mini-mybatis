package com.mybatis.scripting.xmltags;

import com.mybatis.mapping.SqlSource;
import com.mybatis.scripting.LanguageDriver;
import com.mybatis.session.Configuration;
import org.dom4j.Element;


/**
 * @Description: XML语言驱动器
 * @Author: mingri31164
 * @Date: 2025/2/12 19:16
 **/
public class XMLLanguageDriver implements LanguageDriver {

    @Override
    public SqlSource createSqlSource(Configuration configuration, Element script, Class<?> parameterType) {
        // 用XML脚本构建器解析
        XMLScriptBuilder builder = new XMLScriptBuilder(configuration, script, parameterType);
        return builder.parseScriptNode();
    }

}