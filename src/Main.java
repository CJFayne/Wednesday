import com.sky.person.Adult;
import com.sky.person.*;

public class Main {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        String[] names = {"bob","dave","alan","roger","cassandra","karen"};
        Person billy = new Person("bob",12);
        System.out.println(billy.orderDrink());
        Adult[] adults = new Adult[6];
        for(int i = 0; i < adults.length;i++){
            adults[i] = new Adult(names[i],47,"Construction","A-Levels");
            adults[i].orderDrink();


        }
        LivingThing[] livingThing = new LivingThing[2];
        livingThing[0] = new Person("Brianne", 30);
        livingThing[1] = new Fish();
        for (int i = 0; i < livingThing.length; i++){
            livingThing[i].Breathe();
        }
        Edible[] EdibleThings = new Edible[2];
        EdibleThings[0] = new Cake();
        EdibleThings[1] = new Fish();
        for (int i = 0; i < EdibleThings.length; i++){
            EdibleThings[i].eat();
        }
    }
}