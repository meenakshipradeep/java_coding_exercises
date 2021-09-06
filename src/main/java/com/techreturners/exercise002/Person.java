package com.techreturners.exercise002;

public class Person {
    private String city;
    private int age;

    public Person(String fName, String lName, String cityName, int personAge){
        city = cityName;
        age = personAge;
    }

    public String getCity(){
        return city;
    }

    public int getAge(){
        return age;
    }
}

