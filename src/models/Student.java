package models;

public class Student extends Person {
    double gpa;

    public Student() {
        super();
        gpa = 0;
    }

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    @Override
    public double getPaymentAmount() {
        if (gpa>2.67)
            return 36660;
        return 0;
    }
    @Override
    public int compareTo(Person o) {
        return super.compareTo(o);
    }
    @Override
    public String toString() {
        return "Student: " + getId() + ". " + getName() + " " + getSurname() +
                ", earns " + getPaymentAmount() + " kzt" ;
    }
}
