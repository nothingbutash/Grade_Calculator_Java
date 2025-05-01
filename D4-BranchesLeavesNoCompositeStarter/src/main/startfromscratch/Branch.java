package startfromscratch;

import java.util.List;
import java.util.ArrayList;

public class Branch extends TreePart {
    private List<TreePart> tps;

    public Branch(String name) {
        super(name);
        this.tps = new ArrayList<TreePart>();
    }

    public void changeColor(String colour) {
        for (TreePart tp : tps) {
            tp.changeColor(colour);
        }
    }
    
    public void grow (TreePart tp) {
        this.tps.add(tp);
    }
}
