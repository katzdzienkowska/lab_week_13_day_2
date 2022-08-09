package ArnoldCodeClan;

import ArnoldCodeClan.cars.Car;

public interface ITransaction {

    void addCar(Car car);
    void removeCar(Car car);
    void buyCar(Car car);
    void sellCar(Car car);
    void increaseValue(double amount);
    void decreaseValue(double amount);

}
