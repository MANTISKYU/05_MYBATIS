package com.ohgiraffers.remix;

import java.util.List;
import java.util.Map;

public class Controller {

    private final PrintResult printResult;
    private final Service service;


    public Controller() {

        printResult = new PrintResult();
        service = new Service();
    }

    public void selectEmpById(Map<String, String> parameter) {


        String empId = parameter.get("empId");
        EmployeeDTO emp = service.selectEmpById(empId);

        if(emp != null) {

            printResult.printEmp(emp);

        } else {

            printResult.printErrorMessage("selectOne");

        }




    }

    public void selectAllEmp() {

        List<EmployeeDTO> empList = service.selectAllEmp();

        if (empList != null) {

            printResult.printEmpList(empList);

        } else {

            printResult.printErrorMessage("selectList");

        }


    }


}
