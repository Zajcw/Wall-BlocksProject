package horus.zadanie.classes;

import horus.zadanie.interfaces.Block;
import horus.zadanie.interfaces.CompositeBlock;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class CompositeBlockImplementation implements CompositeBlock {

    private List<Block> blocks;

    public CompositeBlockImplementation() {
        super();
        setBlocks(Collections.emptyList());
    }

    public CompositeBlockImplementation(List<Block> blocks) {
        super();
        if(Objects.isNull(blocks))
            setBlocks(Collections.emptyList());
        else
            setBlocks(blocks);
    }

    @Override
    public String getColor() {
        return blocks.stream()
                .map(Block::getColor)
                .reduce((color1, color2) -> color1 + ", " + color2).get();
    }

    @Override
    public String getMaterial() {
        return blocks.stream()
                .map(Block::getMaterial)
                .reduce((material1, material2) -> material1 + ", " + material2).get();
    }

    public void setBlocks(List<Block> blocks) {
        this.blocks = blocks;
    }

    @Override
    public List<Block> getBlocks() {
        return this.blocks;
    }
}
