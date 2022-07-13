package com.sky.person;

public class Person {
        private static String definition = "A class which defines a person by their name and age";
        int age;
        String name;
        //
        public static String getDefinition(){
            return definition;
        }


        public Person(String nameToSet, int ageToSet){
            setAge(ageToSet);
            setName(nameToSet);
        }
        public Person(String nameToSet){
            this(nameToSet,99);
        }
        public Person(){
            this("default",99);
        }
        public int getAge(){
            return age;
        }
        public void setAge(int toSet){
            age = toSet;
        }
        public String getName(){
            return name;
        }
        public void setName(String toSet){
            name = toSet;
        }
        @Override
        public String toString(){
            return "Person{"+
                    "name = "+getName()+"\'"+
                    ",age = "+getAge() + "\'}";
        }
        public boolean orderDrink(){
            return true;
        }

}
