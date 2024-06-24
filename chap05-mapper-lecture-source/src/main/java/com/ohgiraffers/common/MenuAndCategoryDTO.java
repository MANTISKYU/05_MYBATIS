package com.ohgiraffers.common;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString


public class MenuAndCategoryDTO {

    private int code;
    private String name;
    private int price;
    private String orderableStatus;
    private CategoryDTO category;

}
