package horus.zadanie;

import horus.zadanie.classes.BlockImplementation;
import horus.zadanie.classes.CompositeBlockImplementation;
import horus.zadanie.classes.Wall;
import horus.zadanie.interfaces.Block;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Create blocks.
        BlockImplementation redWood = new BlockImplementation("red","wood");
        BlockImplementation greenWood = new BlockImplementation("green","wood");
        BlockImplementation blackWood = new BlockImplementation("black","wood");
        BlockImplementation purpleWood = new BlockImplementation("purple","wood");
        BlockImplementation whiteSteel = new BlockImplementation("white","steel");
        BlockImplementation redSteel = new BlockImplementation("red","steel");
        BlockImplementation blueCarbon = new BlockImplementation("blue","carbon");

        //Create block list and add blocks to it.
        List<Block> blockList = new ArrayList<>();
        blockList.add(redWood);
        blockList.add(greenWood);
        blockList.add(blackWood);
        blockList.add(purpleWood);
        blockList.add(whiteSteel);
        blockList.add(redSteel);
        blockList.add(blueCarbon);

        //Create list of blocks that will be in composite block and add blocks to it.
        List<Block> compositeBlockList = new ArrayList<>();
        compositeBlockList.add(redWood);
        compositeBlockList.add(greenWood);
        compositeBlockList.add(blackWood);
        compositeBlockList.add(purpleWood);

        //Create composite block from the list.
        CompositeBlockImplementation compositeBlock = new CompositeBlockImplementation(compositeBlockList);

        //Print out the colors and materials of each block in the composite block.
        System.out.println(compositeBlock.getColor());
        System.out.println(compositeBlock.getMaterial());

        //Create wall from the block list
        //and print out the blocks by certain material
        //i.e. "steel".
        Wall wall = new Wall(blockList);
        System.out.println(wall.findBlocksByMaterial("wood"));

        //Because method findBlockByColor returns one object
        //i.e. Optional<Block> it will find first instance that
        //fits the color criteria and won't search for more.
        //That's why I put relevant comment in the Wall class
        //with my opinion on this
        System.out.println(wall.findBlockByColor("red"));
    }
}