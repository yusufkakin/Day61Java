package Inheritance.Personandsubclasses;

public class Student extends Person{

    int studyCredits;

    public static void main(String[] args) {

    }
    Student(String name, String address) {
        super(name, address);
    }


    public int credits() {
        return studyCredits;
    }

    public void study(){
        this.studyCredits++;
    }

    @Override
    public String toString() {
        return this.name + "\n\t" + this.address + "\n\tStudy credits " + credits();
    }
}
