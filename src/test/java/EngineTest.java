import ArnoldCodeClan.carComponents.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before() {
        engine = new Engine(1.33);
    }

    @Test
    public void hasEngineSize() {
        assertEquals(1.33, engine.getEngineSize(), 0.0);
    }
}
