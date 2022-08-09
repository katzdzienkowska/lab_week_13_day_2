package ArnoldCodeClan;

import ArnoldCodeClan.cars.Car;

import java.util.ArrayList;

public class Dealership implements ITransaction {

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

    public void addCar(Car car) {
        this.stock.add(car);
    }

    public void removeCar(Car car) {
        this.stock.remove(car);
    }

    public void increaseValue(double amount) {
        this.till += amount;
    }

    public void decreaseValue(double amount) {
        this.till -= amount;
    }

    public void buyCar(Car car) {
        addCar(car);
        decreaseValue(car.getPrice());
    }

    public void sellCar(Car car) {
        removeCar(car);
        increaseValue(car.getPrice());
    }
}
