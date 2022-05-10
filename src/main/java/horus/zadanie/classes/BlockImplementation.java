package horus.zadanie.classes;

import horus.zadanie.interfaces.Block;

public class BlockImplementation implements Block {

    private String color;
    private String material;

    public BlockImplementation(){
        super();
        setColor("");
        setMaterial("");
    }

    public BlockImplementation(String color, String material) {
        setColor(color);
        setMaterial(material);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
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
