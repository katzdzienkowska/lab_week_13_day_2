import ArnoldCodeClan.carComponents.Engine;
import ArnoldCodeClan.carComponents.EngineType;
import ArnoldCodeClan.carComponents.Tyres;
import ArnoldCodeClan.cars.Car;
import ArnoldCodeClan.cars.PetrolCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PetrolCarTest {
    PetrolCar petrolCar;
    Engine engine;
    Tyres tyres;

    @Before
    public void before() {
        petrolCar = new PetrolCar("Yeti", "Blue", 200.00, engine, tyres, EngineType.PETROL);
    }

    @Test
    public void hasModel() {
        assertEquals("Yeti", petrolCar.getModel());
    }

    @Test
    public void hasColour() {
        assertEquals("Blue", petrolCar.getColour());
}

    @Test
    public void hasPrice() {
        assertEquals(200, petrolCar.getPrice(), 0.0);
    }

    @Test
    public void has() {
        assertEquals(200, petrolCar.getPrice(), 0.0);
    }
    @Test
    public void hasEngine() {
        assertEquals(engine, petrolCar.getEngine());
    }

    @Test
    public void hasTyres() {
        assertEquals(tyres, petrolCar.getTyres());
    }

    @Test
    public void hasEngineType() {
        assertEquals(EngineType.PETROL, petrolCar.getEngineType());
    }
    }