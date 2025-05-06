public class Mark implements Gradable {
    private double mark;

    public Mark(double mark) {
        this.mark = mark;
    }
    
    public double getWeight() {
        return 1;
    }

    public boolean setMark(double mark) {
        this.mark = mark;
        return true;
    }

    public double getMark() {
        return mark;
    }
}
