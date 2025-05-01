package startfromscratch;

public class Leaf extends TreePart {
    private String colour;

    public Leaf(String name) {
        super(name);
        this.colour = "GREEN";
    }

    public void changeColor(String colour) {
        this.colour = colour;
    }
}
