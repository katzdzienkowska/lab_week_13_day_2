import ArnoldCodeClan.carComponents.Engine;
import ArnoldCodeClan.carComponents.EngineType;
import ArnoldCodeClan.carComponents.Tyres;
import ArnoldCodeClan.cars.Car;
import ArnoldCodeClan.cars.HybridCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

    HybridCar hybridCar;
    Engine engine;
    Tyres tyres;

    @Before
    public void before() {
        hybridCar = new HybridCar("Toyota", "Black", 300.00, engine, tyres, EngineType.HYBRID);
    }

    @Test
    public void hasModel() {
        assertEquals("Toyota", hybridCar.getModel());
    }

    @Test
    public void hasColour() {
        assertEquals("Black", hybridCar.getColour());
    }

    @Test
    public void hasPrice() {
        assertEquals(300, hybridCar.getPrice(),0.0);
    }

    @Test
    public void hasEngine() {
        assertEquals(engine, hybridCar.getEngine());
    }

    @Test
    public void hasTyres() {
        assertEquals(tyres, hybridCar.getTyres());
    }

    @Test
    public void hasEngineType() {
        assertEquals(EngineType.HYBRID, hybridCar.getEngineType());
    }
}
