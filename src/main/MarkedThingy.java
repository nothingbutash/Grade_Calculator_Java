import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class MarkedThingy implements Gradable {
    private ArrayList<Gradable> subGradables;
    private int dropXLowest;
    private double weight;
    private double grade;

    public MarkedThingy(int dropXLowestp) {
        dropXLowest = dropXLowestp;
        weight = -1;
        grade = getMark();
        subGradables = new ArrayList<Gradable>();
    }

    public boolean setWeight(double w) {
        this.weight = w;
        return true;
    }

    public double getWeight() {
        return this.weight;
    }

    public boolean setDropXLowest(int x) {
        this.dropXLowest = x;
        return true;
    }

    public int getDropXLowest() {
        return this.dropXLowest;
    }

    public double getMark() {
        List<Gradable> subGradables = getSubGradables();
        double weightsTimesMarksSum = 0;
        double weights = 0;
        List<Gradable> markingGradables = new ArrayList<Gradable>();

        for (Gradable subGradable : subGradables) {
            if (subGradable.getMark() >= 0) {
                markingGradables.add(subGradable);
            }
        }

        markingGradables.sort((a, b) -> Double.compare(a.getMark(), b.getMark()));

        for (Gradable subGradable : markingGradables) {            
                if (subGradable.getClass() == new MarkedThingy(0).getClass()) {
                    MarkedThingy subMarkedThingy = (MarkedThingy) subGradable;
                    weightsTimesMarksSum += (subMarkedThingy.getMark() * subMarkedThingy.getWeight());
                    weights += subMarkedThingy.getWeight();
                } else if (subGradable.getClass() == new MarkedThingy(0).getClass()) {
                    weightsTimesMarksSum += subGradable.getMark();
                    weights++;
            }            
        }
        if (weights != 0) {
            return weightsTimesMarksSum/weights;
        } else {
            return -1;
        } 
    }

    public void addSubGradable(Gradable subGradable) {
        subGradables.add(subGradable);
    }

    public void removeSubGradable(Gradable subGradable) {
        subGradables.remove(subGradable);
    }

    public List<Gradable> getSubGradables() {
        return new ArrayList<Gradable>();
    }
}
