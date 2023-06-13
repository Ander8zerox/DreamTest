package com.dctest.dctest.business.impl;

import com.dctest.dctest.business.ChallengeInterface;
import com.dctest.dctest.business.model.Category;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootTest
class ChallengeTest {
    @Autowired
    private ChallengeInterface challenge;

    @Test
    void shouldShowCategoryLevel() {

        ArrayList<Category> categoryList = new ArrayList<>();
        Category category = new Category("categoria1",1L,null, Arrays.asList("cat","cat1"));
        Category categoryB = new Category("categoria2",2L,1L,Arrays.asList("catB","cat2"));
        Category categoryC = new Category("categoria3",3L,2L,Arrays.asList("catC","cat3"));
        Category categoryD = new Category("categoria4",4L,3L,Arrays.asList("catD","cat4"));
        Category categoryE = new Category("categoria5",5L,4L,Arrays.asList("catE","cat5"));

        categoryList.add(category);
        categoryList.add(categoryB);
        categoryList.add(categoryC);
        categoryList.add(categoryD);
        categoryList.add(categoryE);

        challenge.printCategoryLevel(categoryE,categoryList);

    }

    @Test
    void shouldShowCategoryKeyWords() {
        ArrayList<Category> categoryList = new ArrayList<>();
        Category category = new Category("categoria1",1L,null, Arrays.asList("cat","cat1"));
        Category categoryB = new Category("categoria2",2L,1L,Arrays.asList("catB","cat2"));
        Category categoryC = new Category("categoria3",3L,2L,Arrays.asList("catC","cat3"));
        Category categoryD = new Category("categoria4",4L,3L,Arrays.asList("catD","cat4"));
        Category categoryE = new Category("categoria5",5L,4L,Arrays.asList("catE","cat5"));

        categoryList.add(category);
        categoryList.add(categoryB);
        categoryList.add(categoryC);
        categoryList.add(categoryD);
        categoryList.add(categoryE);

        challenge.getKeyWords(categoryC);
    }


}