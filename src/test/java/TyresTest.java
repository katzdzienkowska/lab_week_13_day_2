import ArnoldCodeClan.carComponents.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyresTest {

    Tyres tyres;

    @Before
    public void before() {
        tyres = new Tyres("Continental");
    }

    @Test
    public void hasBrand() {
        assertEquals("Continental", tyres.getBrand());
    }

}
