package inheritance;

public class Tree extends Plant{
    private int trunkDiameter;
    private boolean isEvergreen;

    public Tree(int trunkDiameter, String name, boolean isEvergreen) {
        super(name);
        this.isEvergreen = isEvergreen;
        this.trunkDiameter = trunkDiameter;
    }

    public int getTrunkDiameter() {
        return trunkDiameter;
    }

    public boolean isEvergreen() {
        return isEvergreen;
    }

    @Override
    public void grow() {
        super.grow();
        this.trunkDiameter++;
    }
}
