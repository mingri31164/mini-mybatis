package com.mybatis.scripting.xmltags;


/**
 * @Description: SQL 节点
 * @Author: mingri31164
 * @Date: 2025/2/12 19:16
 **/
public interface SqlNode {

    boolean apply(DynamicContext context);

}