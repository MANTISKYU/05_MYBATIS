package com.ohgiraffers.remix;

import java.util.List;

public class PrintResult {

    public void printEmpList(List<EmployeeDTO> empList) {

        for (EmployeeDTO emp : empList) {

            System.out.println(emp);

        }


    }

    public void printEmp(EmployeeDTO emp) {

        System.out.println(emp);

    }

    public void printErrorMessage(String errorCode) {

        String errorMessage = "";
        switch (errorCode) {

            case "selectList" : errorMessage = "목록조회를 실패했습니다"; break;
            case "selectOne" : errorMessage = "목록조회를 실패했습니다"; break;



        }

        System.out.println(errorMessage);



    }




}
