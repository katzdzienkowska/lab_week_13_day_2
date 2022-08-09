package ArnoldCodeClan;

import ArnoldCodeClan.cars.Car;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<Car> stock;
    private double till;

    public Dealership(double till) {
        this.stock = new ArrayList<>();
        this.till = till;
    }

    public ArrayList<Car> getStock() {
        return stock;
    }

    public double getTill() {
        return till;
    }
}
