package horus.zadanie.classes;

import horus.zadanie.interfaces.Block;

public class BlockImplementation implements Block {

    private final String color;
    private final String material;

    public BlockImplementation() {
        super();
        this.color = "";
        this.material = "";
    }

    public BlockImplementation(String color, String material) {
        this.color = color;
        this.material = material;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public String getMaterial() {
        return this.material;
    }

    @Override
    public String toString() {
        return "BlockImplementation{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                "}";
    }
}
