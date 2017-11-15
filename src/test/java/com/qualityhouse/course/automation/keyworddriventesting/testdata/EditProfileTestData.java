package com.qualityhouse.course.automation.keyworddriventesting.testdata;

import com.qualityhouse.course.automation.keyworddriventesting.support.User;

import java.util.ArrayList;
import java.util.List;

public class EditProfileTestData {

    public static List<User> validUsers = new ArrayList<User>();

    public static List<User> invalidUsers = new ArrayList<User>();

    static {
        validUsers.add(new User("student1", "stpass1", "Student One", "student1@example.com", "+111", "Student Str. 1"));
        validUsers.add(new User("student2", "stpass2", "Student Two", "student2@example.com", "+222", "Student Str. 2"));
        validUsers.add(new User("student3", "stpass3", "Student Three", "student3@example.com", "+333", "Student Str. 3"));
        validUsers.add(new User("student4", "stpass4", "Student Four", "student4@example.com", "+444", "Student Str. 4"));
        validUsers.add(new User("student5", "stpass5", "Student Five", "student5@example.com", "+555", "Student Str. 5"));

        invalidUsers.add(new User("student1", "stpass1", "Student One", "", "+111", "Student Str. 1"));
        invalidUsers.add(new User("student2", "stpass2", "", "student2@example.com", "+222", "Student Str. 2"));
        invalidUsers.add(new User("student3", "stpass3", "Student Three", "student3@example.com", "", "Student Str. 3"));
        invalidUsers.add(new User("student4", "stpass4", "Student Four", "student4@example.com", "+444", ""));

    }
}
