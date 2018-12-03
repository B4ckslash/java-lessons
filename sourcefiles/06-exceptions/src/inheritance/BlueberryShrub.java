package inheritance;

public class BlueberryShrub extends Plant {
    private int area;
    private boolean hasFruit;

    public BlueberryShrub(int area) {
        super("Blueberry Shrub");
        this.area = area;
        this.hasFruit = false;
    }

    @Override
    public void grow() {
        this.area += 4;
        this.hasFruit = !this.hasFruit;
    }
}
