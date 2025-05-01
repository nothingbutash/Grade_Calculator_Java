import java.util.Collection;
import java.util.ArrayList;

public class MarkedThingy implements Gradable {
    private Collection<Gradable> subGradables;
    private double weight;

    public MarkedThingy() {
        weight = -1;
    }
    
    public double getMark() {
        Collection<Gradable> subGradables = getSubGradables();
        double weightsTimesMarksSum = 0;
        double weights = 0;
        for (Gradable subGradable : subGradables) {
            if (subGradable.getMark() >= 0) {
                if (subGradable.getClass() == new MarkedThingy().getClass()) {
                    MarkedThingy subMarkedThingy = (MarkedThingy) subGradable;
                    weightsTimesMarksSum += (subMarkedThingy.getMark() * subMarkedThingy.getWeight());
                    weights += subMarkedThingy.getWeight();
                } else if (subGradable.getClass() == new MarkedThingy().getClass()) {
                    weightsTimesMarksSum += subGradable.getMark();
                    weights++;
                }
            }            
        }
        return weightsTimesMarksSum/weights;
    }

    public double getWeight() {
        return weight;
    }

    public void addSubGradable(Gradable subGradable) {
        subGradables.add(subGradable);
    }

    public void removeSubGradable(Gradable subGradable) {
        subGradables.remove(subGradable);
    }

    public Collection<Gradable> getSubGradables() {
        return new ArrayList<Gradable>();
    }
}
