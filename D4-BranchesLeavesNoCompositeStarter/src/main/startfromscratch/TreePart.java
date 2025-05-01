package startfromscratch;

public abstract class TreePart {
    protected  String name;

    public TreePart(String name) {
        this.name = name;
    }

    public abstract void changeColor(String colour);
}
