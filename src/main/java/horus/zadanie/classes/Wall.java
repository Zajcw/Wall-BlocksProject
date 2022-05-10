package horus.zadanie.classes;

import horus.zadanie.interfaces.Block;
import horus.zadanie.interfaces.Structure;
import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.stream.Collectors;

public class Wall implements Structure {

    private List<Block> blocks;

    public Wall(){
        super();
        this.blocks = Collections.emptyList();
    }

    public Wall(List<Block> blocks) {
        super();
        if(Objects.isNull(blocks))
            this.blocks = Collections.emptyList();
        else
            this.blocks = blocks;
    }

    //But what if there are multiple blocks of the same color?
    //We should use List<Block> to return all the blocks of
    //the color we are looking for. And then the name of method
    //should be changed to findBlocksByColor.
    @Override
    public Optional<Block> findBlockByColor(@NotNull String color) {
        return Optional.of(blocks.stream().
                filter(block -> block
                        .getColor()
                        .contains(color))
                .findAny()).orElseThrow();

    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        return blocks.stream()
                .filter(block -> block.getMaterial().contains(material)).toList();
    }

    @Override
    public int count() {
        return blocks.size();
    }

    @Override
    public String toString() {
        return "Wall{" +
                "blocks=" + blocks +
                '}';
    }
}
