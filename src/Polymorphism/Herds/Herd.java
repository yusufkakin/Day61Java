package Polymorphism.Herds;

import java.util.ArrayList;

public class Herd implements Movable{

    ArrayList<Movable> herd;

    public Herd(){
        this.herd = new ArrayList<>();
    }

    @Override
    public void move(int dx, int dy) {
        for(Movable animal: herd){
            animal.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String print = "";
        for(Movable animal : herd){
            print += animal.toString() + "\n";
        }
        return print;
    }

    public void addToHerd(Movable movable){
        herd.add(movable);
    }
}
