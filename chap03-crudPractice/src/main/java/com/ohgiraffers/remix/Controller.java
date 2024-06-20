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

    public void selectEmpByCode(Map<String, String> parameter) {


        int empId = Integer.parseInt(parameter.get("empId"));
        EmployeeDTO emp = service.selectEmpByCode(empId);

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
