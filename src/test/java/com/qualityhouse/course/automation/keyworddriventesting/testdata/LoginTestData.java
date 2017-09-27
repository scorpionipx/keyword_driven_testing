package com.qualityhouse.course.automation.keyworddriventesting.testdata;

import com.qualityhouse.course.automation.keyworddriventesting.support.User;

import java.util.ArrayList;
import java.util.List;

public class LoginTestData {

    public static List<User> validUsers = new ArrayList<User>();

    public static List<User> invalidUsers = new ArrayList<User>();

    static {
        validUsers.add(new User("student1","stpass1"));
        validUsers.add(new User("student2","stpass2"));
        validUsers.add(new User("student3","stpass3"));
        validUsers.add(new User("student4","stpass4"));
        validUsers.add(new User("student5","stpass5"));

        invalidUsers.add(new User("","some password"));
        invalidUsers.add(new User("student1",""));
        invalidUsers.add(new User("student1","wrong"));
        invalidUsers.add(new User("student2","wrong password"));
    }

}
