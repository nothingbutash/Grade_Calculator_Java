package refactortogetthere;

import java.util.ArrayList;
import java.util.List;

// Represents a branch of a tree having an arbitrary number
// of other branches and/or leaves
public class Branch extends TreePart {
    private List<TreePart> tps;
    

    // EFFECTS: constructs a branch with the given name
    // having no other branches or leaves
    public Branch(String name) {
        super(name);
        tps = new ArrayList<>();
    }

    // MODIFIES: this
    // EFFECTS: adds TreePart to this branch
    public void grow(TreePart tp) {
        tps.add(tp);
    }

    // MODIFIES: this
    // EFFECTS: changes colour of this branch
    public void changeColour(String colour) {
        System.out.println(name + " changing colour of its leaves to " + colour);
        for (TreePart tp : tps) {
            tp.changeColour(colour);
        }
    }
}
