package com.demo.test;

import com.demo.mapper.SpecilMapper;
import com.demo.po.Specil;
import com.demo.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestIf {
    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtils.getSqlSession(false);
        int pageNum = 1;
        int pageSize = 3;

        int start = (pageNum - 1) * pageSize;
        String colName="spilinfoname";
        String keyword="技术";
        //把多个参数放入"篮子"
        Map<String, Object> map = new HashMap<>();
        map.put("start",start);
        map.put("pageSize",pageSize);
        map.put("colName",colName);
        map.put("keyword",keyword);
        SpecilMapper specilMapper = sqlSession.getMapper(SpecilMapper.class);
        List<Specil> specilList = specilMapper.findAllSplit(map);
        for (Specil specil: specilList) {
            System.out.println(specil);
        }
    }
}
