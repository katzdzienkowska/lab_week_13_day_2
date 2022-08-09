package ArnoldCodeClan;

import ArnoldCodeClan.cars.Car;

import java.util.ArrayList;

public class Customer implements ITransaction{

    private double money;
    private ArrayList<Car> ownedCars;

    public Customer(double money) {
        this.money = money;
        this.ownedCars = new ArrayList<>();
    }

    public double getMoney() {
        return money;
    }

    public ArrayList<Car> getOwnedCars() {
        return ownedCars;
    }

    public void addCar(Car car) {
        this.ownedCars.add(car);
    }

    public void removeCar(Car car) {
        this.ownedCars.remove(car);
    }

    public void increaseValue(double amount) {
        this.money += amount;
    }

    public void reduceValue(double amount) {
        this.money -= amount;
    }

    public void buyCar(Car car) {
        addCar(car);
        reduceValue(car.getPrice());
    }

    public void sellCar(Car car) {
        removeCar(car);
        increaseValue(car.getPrice());
    }
}
