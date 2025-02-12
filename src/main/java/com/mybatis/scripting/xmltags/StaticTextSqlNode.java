package com.mybatis.scripting.xmltags;


/**
 * @Description: 静态文本SQL节点
 * @Author: mingri31164
 * @Date: 2025/2/12 19:16
 **/
public class StaticTextSqlNode implements SqlNode{

    private String text;

    public StaticTextSqlNode(String text) {
        this.text = text;
    }

    @Override
    public boolean apply(DynamicContext context) {
        //将文本加入context
        context.appendSql(text);
        return true;
    }

}
