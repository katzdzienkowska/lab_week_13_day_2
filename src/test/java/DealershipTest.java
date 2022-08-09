import ArnoldCodeClan.Dealership;
import ArnoldCodeClan.carComponents.Engine;
import ArnoldCodeClan.carComponents.EngineType;
import ArnoldCodeClan.carComponents.Tyres;
import ArnoldCodeClan.cars.HybridCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    HybridCar hybridCar;
    Engine engine;
    Tyres tyres;

    @Before
    public void before() {

        dealership = new Dealership(5000.00);
        hybridCar = new HybridCar("Toyota", "Black", 300.00, engine, tyres, EngineType.HYBRID);
    }

    @Test
    public void hasTill() {
        assertEquals(5000.00, dealership.getTill(), 0.0);
    }

    @Test
    public void hasZeroStock() {
        assertEquals(0, dealership.getStock().size());
    }

    @Test
    public void canBuyACar() {
        assertEquals(0, dealership.getStock().size());
        assertEquals(5000.00, dealership.getTill(), 0.0);
        dealership.buyCar(hybridCar);
        assertEquals(1, dealership.getStock().size());
        assertEquals(4700.00, dealership.getTill(), 0.0);
    }

    @Test
    public void canSellCar() {
        dealership.addCar(hybridCar);
        assertEquals(1, dealership.getStock().size());
        assertEquals(5000.00, dealership.getTill(), 0.0);
        dealership.sellCar(hybridCar);
        assertEquals(0, dealership.getStock().size());
        assertEquals(5300.00, dealership.getTill(), 0.0);
    }
}
