package com.ohgiraffers.remix;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.remix.Template.getSqlSession;

public class Service {

    private Mapper mapper;

    public List<EmployeeDTO> selectAllEmp() {

        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(Mapper.class);

        List<EmployeeDTO> empList = mapper.selectAllEmp();

        sqlSession.close();

        return empList;



    }

    public EmployeeDTO selectEmpById(String empId) {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(Mapper.class);

        EmployeeDTO emp = mapper.selectEmpById(empId);

        sqlSession.close();
        return emp;

    }

}
