package com.demo.mapper;

import com.demo.po.Specil;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SpecilMapper {
    Specil findSpecilById(int id);

    List<Specil> findAllSplit(Map<String,Object> map);
}
