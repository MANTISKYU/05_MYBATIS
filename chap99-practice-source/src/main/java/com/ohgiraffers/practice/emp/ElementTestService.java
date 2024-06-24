package com.ohgiraffers.practice.emp;


import com.ohgiraffers.common.EmpNameAndDeptTitleDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.common.Template.getSqlSession;

public class ElementTestService {

    private ElementTestMapper mapper;


    public void associationTest() {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(ElementTestMapper.class);

        List<EmpNameAndDeptTitleDTO> empList = mapper.associationTest();

        for(EmpNameAndDeptTitleDTO emp : empList) {

            System.out.println("이름 = " + emp.getEmpName() + " 부서명 = " + emp.getDeptTitle());

        }


        sqlSession.close();

    }
}
