public class Tank {
    private float fill;

    public Tank(float fill) {
        this.fill = fill;
    }

    public void printInfo() {
        System.out.printf("I am a Tank with %.2f filling%n", fill);
    }
}
