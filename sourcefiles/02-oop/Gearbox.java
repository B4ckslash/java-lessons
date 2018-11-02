public class Gearbox {
    private int nrGears;

    public Gearbox(int nrGears) {
        this.nrGears = nrGears;
    }

    public void printInfo() {
        System.out.printf("I am a Gearbox with %d gears%n", nrGears);
    }

    public void shift() {}
}
