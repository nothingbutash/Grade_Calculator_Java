public class Mark implements Gradable {
    private double mark;

    public Mark(double mark) {
        this.mark = mark;
    }
    
    public double getWeight() {
        return 1;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public double getMark() {
        return mark;
    }
}
