/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MimiHMB
 */
import java.util.ArrayList;

public class Box implements Packable {
    private double capacity;
    private ArrayList<Packable> list;
    
    public Box(double maximumCapacity) {
        this.capacity = maximumCapacity;
        this.list = new ArrayList();
    }
    
    public void add(Packable item) {
        if (this.capacity - item.weight() >= 0) {
            this.list.add(item);
            this.capacity -= item.weight();
        }
    }
    
    @Override
    public double weight() {
        double sum = 0.0;
        for (Packable i: this.list) {
            sum += i.weight();
        }
        return sum;
    }
    
    @Override
    public String toString() {
        return "Box: " + this.list.size() + " items, total weight " + this.weight() + " kg";
    }
    
}
