import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;
import java.util.ArrayList;

public class MarkedThingy implements Gradable {
    private ArrayList<Gradable> subGradables;
    private int dropXLowest;
    private double weight;

    public MarkedThingy() {
        this(0);
    }

    public MarkedThingy(int dropXLowestp) {
        this(dropXLowestp, 1);
    }

    public MarkedThingy(int dropXLowestp, double weightp) {
        this.dropXLowest = dropXLowestp;
        weight = weightp;
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
        return dropXLowest;
    }
    
    // public double getMark() {
        // Collection<Gradable> subGradables = getSubGradables();
        // double weightsTimesMarksSum = 0;
        // double weights = 0;
        // subGradable.filter( (a,b) -> {return a.getMark() > b.getMark()} )
        // subGradable.sort( (a,b) -> {return a.getMark() > b.getMark()} )

        // for (Gradable subGradable : subGradables) {
        //     if (subGradable.getMark() >= 0) {
        //         if (subGradable.getClass() == new MarkedThingy(0).getClass()) {
        //             MarkedThingy subMarkedThingy = (MarkedThingy) subGradable;
        //             weightsTimesMarksSum += (subMarkedThingy.getMark() * subMarkedThingy.getWeight());
        //             weights += subMarkedThingy.getWeight();
        //         } else if (subGradable.getClass() == new MarkedThingy(0).getClass()) {
        //             weightsTimesMarksSum += subGradable.getMark();
        //             weights++;
        //         }
        //     }            
        // }
        // if (weights != 0) {
        //     return weightsTimesMarksSum/weights;
        // } else {
        //     return -1;
        // }
        // return -1;
    // }

    // public double getMark() {

    //     Stream<Gradable> subGradable = getSubGradables().stream().filter(e -> e.getMark() == -1);
        
    //     if(subGradable.skip(dropXLowest).count() < 1) return -1;            

    //     subGradable.sorted(((a, b) -> Double.compare(a.getMark(), b.getMark())));

    //     double totalWeight = subGradable.skip(dropXLowest).mapToDouble(e -> getWeight()).sum();

    //     double mark = subGradable
    //         .skip(dropXLowest)
    //         .mapToDouble(e -> e.getMark() * e.getWeight())
    //         .sum();

    //     return mark/totalWeight;

    // }


    public double getMark() {

        List<Gradable> subGradable = getSubGradables()
            .stream()
            .filter(e -> e.getMark() != -1)
            .sorted(((a, b) -> Double.compare(a.getMark(), b.getMark())))
            .skip(dropXLowest)
            .toList();
        
        if (subGradable.isEmpty()) return -1;   

        double totalWeight = subGradable
            .stream()
            .mapToDouble(e -> getWeight())
            .sum();

        double mark = subGradable
            .stream()
            .mapToDouble(e -> e.getMark() * e.getWeight())
            .sum();

        return mark/totalWeight;

    }

    public void addSubGradable(Gradable subGradable) {
        subGradables.add(subGradable);
    }

    public void removeSubGradable(Gradable subGradable) {
        subGradables.remove(subGradable);
    }

    public Collection<Gradable> getSubGradables() {
        return subGradables;
    }
}
