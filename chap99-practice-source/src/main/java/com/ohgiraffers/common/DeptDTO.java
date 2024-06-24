package com.ohgiraffers.common;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class DeptDTO {

    private String deptId;
    private String deptTitle;
    private DeptDTO dept;



}
