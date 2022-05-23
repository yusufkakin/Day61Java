package Inheritance.Warehousing;

import java.util.ArrayList;

public class ChangeHistory {

    final ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        history.add(status);
    }

    public void clear() {
        this.history.removeAll(history);
    }

    @Override
    public String toString() {
        return this.history.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    public double maxValue() {
        double maximum = 0.0;
        if (this.history.size() > 0) {
            for (Double one : this.history) {
                if (one > maximum) {
                    maximum = one;
                }
            }
        }
        return maximum;
    }

    public double minValue() {
        double minimum = this.history.get(0);
        for (Double one : this.history) {
            if (one < minimum) {
                minimum = one;
            }
        }
        return minimum;
    }

    public double average(){
        double average = 0.0;
        if(this.history.size() > 0){
            for(Double values : this.history){
                if(values > average){
                    average += values;

                }

            }
            average /= this.history.size();
        }
        return average;
    }
}