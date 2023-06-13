package com.dctest.dctest.business.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * Class that represents the Category model
 */
@Getter
@Setter
@AllArgsConstructor
public class Category {

    private String categoryName;
    private Long categoryId;
    private Long categoryParentId;
    private List<String> keyWords;

}
