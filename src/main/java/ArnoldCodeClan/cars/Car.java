package ArnoldCodeClan.cars;
import ArnoldCodeClan.carComponents.Engine;
import ArnoldCodeClan.carComponents.Tyres;

public abstract class Car {

    private String model;
    private String colour;
    private double price;
    private Engine engine;
    private Tyres tyres;

    public Car(String model, String colour, double price, Engine engine, Tyres tyres) {
        this.model = model;
        this.colour = colour;
        this.price = price;
        this.engine = engine;
        this.tyres = tyres;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public double getPrice() {
        return price;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tyres getTyres() {
        return tyres;
    }
}
