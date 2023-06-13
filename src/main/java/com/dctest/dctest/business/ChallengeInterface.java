package com.dctest.dctest.business;

import com.dctest.dctest.business.model.Category;

import java.util.ArrayList;
import java.util.Map;

public interface ChallengeInterface {

    void getKeyWords(Category category);

    StringBuilder getCategoryLevel(Map<Long,Category> parentMap, Category categoryToSearch, StringBuilder level);

    void printCategoryLevel(Category categoryToPrint, ArrayList<Category> categoryList);
}
