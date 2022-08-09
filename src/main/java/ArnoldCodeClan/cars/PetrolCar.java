package ArnoldCodeClan.cars;

import ArnoldCodeClan.carComponents.Engine;
import ArnoldCodeClan.carComponents.EngineType;
import ArnoldCodeClan.carComponents.Tyres;

public class PetrolCar extends Car {

    private EngineType engineType;

    public PetrolCar(String model, String colour, double price, Engine engine, Tyres tyres, EngineType engineType) {
        super(model, colour, price, engine, tyres);
        this.engineType = engineType;
    }

    public EngineType getEngineType() {
        return engineType;
    }
}
