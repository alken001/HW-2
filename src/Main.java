import models.Employee;
import models.Person;
import models.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Person e1 = new Employee("Didar", "Zholdybaev", "Developer", 5800);
        Person e2 = new Employee("Kazybek", "Seitkazy", "Manager", 4254);
        Person e3 = new Employee("Alken", "Zaiyr", "Chemist", 11555555);
        Person e4 = new Employee("Arman", "Zholdasev", "Pirate", 163450);
        Person e5 = new Employee("Erlen", "Eressen", "Astronaut", 360500);

        Person s1 = new Student("Ernur", "Batyrbek", 2.90);
        Person s2 = new Student("Samat", "Samatov", 2.10);
        Person s3 = new Student("Piter", "Parker", 2.00);
        Person s4 = new Student("Mukhtar", "Jorabaev", 3.10);
        Person s5 = new Student("Kalzhan", "Kenbai", 3.95);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(e1);
        persons.add(e2);
        persons.add(e3);
        persons.add(e4);
        persons.add(e5);
        persons.add(s1);
        persons.add(s2);
        persons.add(s3);
        persons.add(s4);
        persons.add(s5);

        Collections.sort(persons);
        printData(persons);
    }

    static void printData(Iterable<Person> persons){

        for (Person person : persons){
            System.out.println(person.toString());
        }
    }
}