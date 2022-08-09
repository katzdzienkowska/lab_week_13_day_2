import ArnoldCodeClan.Dealership;
import ArnoldCodeClan.cars.HybridCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;

    @Before
    public void before() {
        dealership = new Dealership(5000.00);
    }

    @Test
    public void hasTill() {
        assertEquals(5000.00, dealership.getTill(), 0.0);
    }

    @Test
    public void hasZeroStock() {
        assertEquals(0, dealership.getStock().size());
    }
}
