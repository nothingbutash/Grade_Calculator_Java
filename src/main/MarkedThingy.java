import java.util.Collection;
import java.util.ArrayList;

public class MarkedThingy implements Gradable {
    private Collection<Gradable> subGradables;
    private double weight;

    public MarkedThingy(int dropXLowestp) {
        private int dropXLowest;
        private double weight = -1;
        private double grade = getMark();
        private ArrayList<Gradable>() subGradables = new ArrayList<Gradable>;
    }

    public boolean setWeight(double w) {
        this.weight = w;
        return true;
    }

    public double getWeight() {
        return this.weight;
    }
        
    public boolean setDropXLowest(double x) {
        this.dropXLowest = x;
        return true;
    }

    public double getDropXLowest() {
        return this.dropXLowest;
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
        if (weights != 0) {
            return weightsTimesMarksSum/weights;
        } else {
            return -1;
        }
        
    }


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
