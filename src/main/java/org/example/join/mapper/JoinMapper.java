package org.example.join.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;

import java.util.List;
import java.util.Map;

public interface JoinMapper {
    @ResultMap("JoinResultMap")
    List<Map<String, Object>> performJoin(@Param("joinQuery") String joinQuery);
}
