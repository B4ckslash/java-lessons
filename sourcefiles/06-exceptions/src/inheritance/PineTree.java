package inheritance;

public class PineTree extends Tree{

    public PineTree(int trunkDiameter, String name) {
        super(trunkDiameter, name, true);
    }

    public void dropCones() {
        //drop pine cones
    }
}
