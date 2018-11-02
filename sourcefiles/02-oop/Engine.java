public class Engine {
    private int nrCylinders;
    private int hp;

    public Engine(int nrCylinders, int hp) {
        this.nrCylinders = nrCylinders;
        this.hp = hp;
    }

    public void run() {}

    public void printInfo() {
        System.out.printf("I am an engine with %d cylinders and %d HP%n", nrCylinders, hp);
    }
}
