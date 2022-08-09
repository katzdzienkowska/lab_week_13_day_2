import ArnoldCodeClan.carComponents.Engine;
import ArnoldCodeClan.carComponents.EngineType;
import ArnoldCodeClan.carComponents.Tyres;
import ArnoldCodeClan.cars.ElectricCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    ElectricCar electricCar;
    Engine engine;
    Tyres tyres;

    @Before
    public void before() {
        electricCar = new ElectricCar("Tesla", "White", 150.00, engine, tyres, EngineType.ELECTRIC);

    }

    @Test
    public void hasModel() {
        assertEquals("Tesla", electricCar.getModel());
    }

    @Test
    public void hasColour() {
        assertEquals("White", electricCar.getColour());
    }

    @Test
    public void hasPrice() {
        assertEquals(150, electricCar.getPrice(), 0.0);
    }

    @Test
    public void hasEngine() {
        assertEquals(engine, electricCar.getEngine());
    }

    @Test
    public void hasTyres() {
        assertEquals(tyres, electricCar.getTyres());
    }

    @Test
    public void hasEngineType() {
        assertEquals(EngineType.ELECTRIC, electricCar.getEngineType());
    }
}
