package com.demo.test;

import com.demo.mapper.SpecilMapper;
import com.demo.po.Specil;
import com.demo.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.test.context.jdbc.Sql;

public class TestFirstCache {
    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtils.getSqlSession(false);
        SpecilMapper specilMapper = sqlSession.getMapper(SpecilMapper.class);
        Specil specil1 = specilMapper.findSpecilById(1);
        System.out.println(specil1);
//        sqlSession.commit();
       // sqlSession.clearCache();
        System.out.println("****************");
        Specil specil2 = specilMapper.findSpecilById(1);
        System.out.println(specil2);
    }
}
