
import java.util.*;
import java.lang.String;

public class AnotherMainClass {

    public static void main(String[] arg){
        System.out.println("Testing this");

        List<Person> listOfName = Arrays.asList(
                new Person("Saurabh","Chanderiya"),
                new Person("Navneet","Oberoi"),
                new Person("Anusha", "Shetty")
                );
        //One way of using Lambda
        listOfName.sort(Comparator.comparing(person -> person.firstName));

        //Another way of using lambda
        Collections.sort(listOfName, (p1,p2)-> p1.secondName.compareTo(p2.secondName));

        for(Person p : listOfName){
            System.out.println(p.firstName + " " + p.secondName);
        }
    }


}


class Person{
    String firstName;

    String secondName;

    Person(String firstName, String secondName){
        this.firstName = firstName;
        this.secondName = secondName;
    }
}