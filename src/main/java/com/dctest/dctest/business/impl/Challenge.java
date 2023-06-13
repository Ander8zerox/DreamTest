package com.dctest.dctest.business.impl;

import com.dctest.dctest.business.ChallengeInterface;
import com.dctest.dctest.business.model.Category;
import com.dctest.dctest.business.util.Constants;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Business class
 */
@Service
public class Challenge implements ChallengeInterface {

    /**
     * Method that returns keywords of a given Category
     * @param category
     */
    public void getKeyWords(Category category){
        category.getKeyWords().forEach(System.out::println);
    }

    /**
     * Method that returns category level of a given Category
     * @param parentMap
     * @param categoryToSearch
     * @param level
     * @return
     */
    public StringBuilder getCategoryLevel(Map<Long, Category> parentMap, Category categoryToSearch, StringBuilder level){

        if(categoryToSearch.getCategoryParentId() != null){
            if(parentMap.containsKey(categoryToSearch.getCategoryParentId())){
                Category tempCategory = parentMap.get(categoryToSearch.getCategoryParentId());
                level.insert(Constants.ZERO_INDEX,tempCategory.getCategoryName() + Constants.LEVEL_SEPARATOR);
                getCategoryLevel(parentMap,tempCategory,level);
            }
        }
        return level;
    }

    public void printCategoryLevel(Category categoryToPrint,ArrayList<Category> categoryList){
        Map<Long,Category> parentMap = categoryList.stream()
                .collect(Collectors.toMap(Category::getCategoryId, Function.identity()));

        StringBuilder result = new StringBuilder(categoryToPrint.getCategoryName());
        result = getCategoryLevel(parentMap,categoryToPrint,result);
        System.out.println("Level for category " + categoryToPrint.getCategoryName() + " is : " + result);
    }
}
