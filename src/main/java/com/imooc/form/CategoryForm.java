package com.imooc.form;

import lombok.Data;

/**
 * @Author JXUT CXY
 * @Description
 * @Date: created in 10:20 2019/8/22
 */
@Data
public class CategoryForm {
    private Integer categoryId;

    //类目名字
    private String categoryName;

    //类目编号
    private Integer categoryType;
}
