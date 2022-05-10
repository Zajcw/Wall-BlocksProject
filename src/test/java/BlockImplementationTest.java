import horus.zadanie.classes.BlockImplementation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlockImplementationTest {

    BlockImplementation block1 = new BlockImplementation();
    BlockImplementation block2 = new BlockImplementation();

    @BeforeEach
    void setUp() {
        block1.setColor("red");
        block1.setMaterial("wood");
        block2.setColor("white");
        block2.setMaterial("steel");
    }

    @Test
    void getColor() {
        assertEquals("red",block1.getColor());
        assertEquals("white",block2.getColor());
    }

    @Test
    void getMaterial() {
        assertEquals("wood",block1.getMaterial());
        assertEquals("steel",block2.getMaterial());
    }

    @Test
    void testToString() {
        assertEquals("BlockImplementation{color='red', material='wood'}",block1.toString());
    }
}