package com.ohgiraffers.common;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class EmpNameAndDeptTitleDTO {

    private String empName;
    private String deptTitle;
    private String deptId;
    private EmpNameAndDeptTitleDTO empNameAndDeptTitle;
    private DeptDTO dept;



}
