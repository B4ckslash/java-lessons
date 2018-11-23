package inheritance;

public class BirchTree extends Plant {
    private int trunkDiameter;
    private boolean isEvergreen;
    private boolean hasLeaves;

    public BirchTree(int trunkDiameter, boolean hasLeaves) {
        this.trunkDiameter = trunkDiameter;
        this.isEvergreen = false;
        this.hasLeaves = hasLeaves;
    }

    @Override
    public void grow() {
        super.grow();
        this.trunkDiameter++;
    }

    public void loseLeaves() {
        this.hasLeaves = !this.hasLeaves;
    }
}
