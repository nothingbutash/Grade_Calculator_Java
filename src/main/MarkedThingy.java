import java.util.Collection;
import java.util.ArrayList;

public class MarkedThingy implements Gradable {
    private Collection<Gradable> subGradables;

    public MarkedThingy() {
        
    }
    
    public double getMark() {
        return 1.0;//stub
    }

    public void addSubGradable() {

    }

    public void removeSubGradable() {

    }

    public Collection<Gradable> getSubGradables() {
        return new ArrayList<Gradable>();
    }
}
