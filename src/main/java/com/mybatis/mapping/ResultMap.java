package com.mybatis.mapping;

import com.mybatis.session.Configuration;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * @Description: 结果映射
 * @Author: mingri31164
 * @Date: 2025/2/16 4:50
 **/
public class ResultMap {

    private String id;
    private Class<?> type;
    private List<ResultMapping> resultMappings;
    private Set<String> mappedColumns;

    private ResultMap() {
    }

    public static class Builder {
        private ResultMap resultMap = new ResultMap();

        public Builder(Configuration configuration, String id, Class<?> type, List<ResultMapping> resultMappings) {
            resultMap.id = id;
            resultMap.type = type;
            resultMap.resultMappings = resultMappings;
        }

        public ResultMap build() {
            resultMap.mappedColumns = new HashSet<>();
            return resultMap;
        }

    }

    public String getId() {
        return id;
    }

    public Set<String> getMappedColumns() {
        return mappedColumns;
    }

    public Class<?> getType() {
        return type;
    }

    public List<ResultMapping> getResultMappings() {
        return resultMappings;
    }

}
