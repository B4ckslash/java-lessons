package inheritance;

public class BirchTree extends Tree {
    private boolean hasLeaves;

    public BirchTree(int trunkDiameter, boolean hasLeaves, String name) {
        super(trunkDiameter, name, false);
        this.hasLeaves = hasLeaves;
    }

    public void loseLeaves() {
        this.hasLeaves = !this.hasLeaves;
    }
}
