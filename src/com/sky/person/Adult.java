package com.sky.person;

public class Adult extends Person{
    private String job;
    private String highestQualification;
    public Adult(String name, int age, String jobToSet, String qualToSet){
        super(name,age);
        job = jobToSet;
        highestQualification = qualToSet;
    }
    public Adult(){
        this("dave", 99, "retail","degree");
    }
    @Override
    public boolean orderDrink(){
        System.out.println("THIS IS ALCOHOLIC");
        return getAge() >= 18;


    }
}

