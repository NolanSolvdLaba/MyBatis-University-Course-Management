package org.example.join.service;

import org.example.join.model.JoinResult;
import org.example.join.mapper.JoinMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JoinService {
    private final JoinMapper joinMapper;

    public JoinService(JoinMapper joinMapper) {
        this.joinMapper = joinMapper;
    }

    public List<JoinResult> performJoinQuery(String joinQuery) {
        List<Map<String, Object>> resultMapList = joinMapper.performJoin(joinQuery);

        List<JoinResult> joinResults = new ArrayList<>();
        for (Map<String, Object> resultMap : resultMapList) {
            JoinResult joinResult = new JoinResult();
            // Set the properties of joinResult based on the resultMap
            joinResult.setProperty1((String) resultMap.get("property1"));
            joinResult.setProperty2((int) resultMap.get("property2"));
            joinResults.add(joinResult);
        }

        return joinResults;
    }
}
