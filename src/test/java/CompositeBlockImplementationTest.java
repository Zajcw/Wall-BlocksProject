import horus.zadanie.classes.BlockImplementation;
import horus.zadanie.classes.CompositeBlockImplementation;
import horus.zadanie.interfaces.Block;
import horus.zadanie.interfaces.CompositeBlock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CompositeBlockImplementationTest {

    CompositeBlock compositeBlock1;
    CompositeBlock compositeBlock2;
    Block block1;
    Block block2;

    List<Block> blockList1 = new ArrayList<>();
    List<Block> blockList2 = new ArrayList<>();

    @BeforeEach
    void setUp() {
        block1 =  new BlockImplementation("red","wood");
        block2 = new BlockImplementation("white","stone");
        blockList1.add(block1);
        blockList1.add(block2);
        blockList2.add(block1);
        blockList2.add(block2);
        blockList2.add(block1);
        compositeBlock1 = new CompositeBlockImplementation(blockList1);
        compositeBlock2 = new CompositeBlockImplementation(blockList2);
    }

    @Test
    void getColor() {
        assertEquals("red, white", compositeBlock1.getColor());
        assertEquals("red, white, red", compositeBlock2.getColor());
    }

    @Test
    void getMaterial() {
        assertEquals("wood, stone",compositeBlock1.getMaterial());
        assertEquals("wood, stone, wood",compositeBlock2.getMaterial());
    }

    @Test
    void getBlocks() {
        assertEquals("[BlockImplementation{color='red', material='wood'}, BlockImplementation{color='white', material='stone'}, BlockImplementation{color='red', material='wood'}]",compositeBlock2.getBlocks().toString());
    }
}