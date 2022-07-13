package com.sky.person;

public class Fish extends LivingThing implements Edible{
    @Override
    public void Breathe() {
        System.out.println("I breathe through gills.");
    }
    @Override
    public void eat() {
        System.out.println("Goes to stomach :)");
    }
}
