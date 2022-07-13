import com.sky.person.Adult;
import com.sky.person.Person;

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

    }
}