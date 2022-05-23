package Personandsubclasses;

public class Teacher extends Person{
     int salary = 0;

    Teacher(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return this.name + "\n\t" + this.address + "\n\t" + "salary " + this.salary + " euro/month";
    }
}
