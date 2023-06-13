package com.dctest.dctest.business.model;

import com.dctest.dctest.business.util.Constants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RootCategory {
    List<String> keyWords = new ArrayList<>();
    public RootCategory(){
        this.keyWords = Arrays.asList(Constants.ROOT_KEYWORD,Constants.CATEGORY_KEYWORD);
    }
}
