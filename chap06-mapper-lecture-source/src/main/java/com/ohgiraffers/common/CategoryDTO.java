package com.ohgiraffers.common;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CategoryDTO {

    private int code;
    private String name;
    private Integer refCategoryCode;
    private CategoryDTO category;
//    private String categoryName;



}
