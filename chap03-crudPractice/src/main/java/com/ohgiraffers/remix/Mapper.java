package com.ohgiraffers.remix;

import java.util.List;

public interface Mapper {

    List<EmployeeDTO> selectAllEmp();

    EmployeeDTO selectEmpByCode(int code);





}
