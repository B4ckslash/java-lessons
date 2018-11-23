package inheritance;

public class PineTree extends Plant {
    private int trunkDiameter;
    private boolean isEvergreen;

    public PineTree(int trunkDiameter) {
        super("Pine");
        this.isEvergreen = true;
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

    public void dropCones() {
        //drop pine cones
    }
}
