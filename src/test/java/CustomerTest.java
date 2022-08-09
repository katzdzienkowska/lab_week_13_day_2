import ArnoldCodeClan.Customer;
import ArnoldCodeClan.carComponents.Engine;
import ArnoldCodeClan.carComponents.EngineType;
import ArnoldCodeClan.carComponents.Tyres;
import ArnoldCodeClan.cars.ElectricCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    ElectricCar electricCar;
    Tyres tyres;
    Engine engine;

    @Before
    public void before() {
        customer = new Customer(300.00);
        electricCar = new ElectricCar("Tesla", "White", 150.00, engine, tyres, EngineType.ELECTRIC);
    }

    @Test
    public void hasMoney() {
        assertEquals(300.00, customer.getMoney(), 0.0);
    }

    @Test
    public void hasEmptyArrayOfOwnedCars() {
        assertEquals(0, customer.getOwnedCars().size());
    }

    @Test
    public void canBuyACar() {
        assertEquals(0, customer.getOwnedCars().size());
        assertEquals(300.00, customer.getMoney(), 0.0);
        customer.buyCar(electricCar);
        assertEquals(1, customer.getOwnedCars().size());
        assertEquals(150.00, customer.getMoney(), 0.0);
    }

    @Test
    public void canSellCar() {
        customer.addCar(electricCar);
        assertEquals(1, customer.getOwnedCars().size());
        assertEquals(300.00, customer.getMoney(), 0.0);
        customer.sellCar(electricCar);
        assertEquals(0, customer.getOwnedCars().size());
        assertEquals(450.00, customer.getMoney(), 0.0);
    }
}
