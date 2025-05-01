package refactortogetthere;

// Represents a leaf having a name and a colour
public class Leaf extends TreePart {
    private String colour;

    // EFFECTS: constructs a green leaf with given name
    public Leaf(String name) {
        super(name);
        this.colour = "green";
    }

    // MODIFIES: this
    // EFFECTS: changes colour of this leaf to colour
    public void changeColour(String colour) {
        System.out.println(name + " changing colour to: " + colour);
        this.colour = colour;
    }
}
