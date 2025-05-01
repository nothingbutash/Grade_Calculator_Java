import java.util.Collection;
import java.util.ArrayList;

public class MarkedThingy implements Gradable {
    private ArrayList<Gradable> subGradables;
    private int dropXLowest;
    private double weight;
    private double grade;

    public MarkedThingy() {
        dropXLowest = 0;
        weight = -1;
        grade = getMark();
        subGradables = new ArrayList<Gradable>();
    }

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
        /*         Collection<Gradable> subGradables = getSubGradables();
        double weightsTimesMarksSum = 0;
        double weights = 0;
        subGradable.filter( (a,b) -> {return a.getMark() > b.getMark()} )
        subGradable.sort( (a,b) -> {return a.getMark() > b.getMark()} )

        for (Gradable subGradable : subGradables) {
            if (subGradable.getMark() >= 0) {
                if (subGradable.getClass() == new MarkedThingy(0).getClass()) {
                    MarkedThingy subMarkedThingy = (MarkedThingy) subGradable;
                    weightsTimesMarksSum += (subMarkedThingy.getMark() * subMarkedThingy.getWeight());
                    weights += subMarkedThingy.getWeight();
                } else if (subGradable.getClass() == new MarkedThingy(0).getClass()) {
                    weightsTimesMarksSum += subGradable.getMark();
                    weights++;
                }
            }            
        }
        if (weights != 0) {
            return weightsTimesMarksSum/weights;
        } else {
            return -1;
        } */
        return -1;
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
