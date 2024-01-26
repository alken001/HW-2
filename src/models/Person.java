package models;
import interfaces.Payable;
public class Person implements Payable, Comparable<Person> {
    private int id;
    private static int id_gen = 1;
    private String name;
    private String surname;


    public Person(){
        id = id_gen++;
    }
    public Person(String name, String surname){
        this();
        setName(name);
        setSurname(surname);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getPosition(){
        return "Just a Person";
    }

    @Override
    public String toString() {
        return "Person | " +
                " id: " + id +
                " | name: " + name + " | " +
                " surname: " + surname ;
    }

    @Override
    public double getPaymentAmount() {
        return 0;
    }

    @Override
    public int compareTo(Person o) {
        return Double.compare(this.getPaymentAmount(), o.getPaymentAmount());
    }
}