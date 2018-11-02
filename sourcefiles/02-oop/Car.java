public class Car {
    private int nrSeats;
    private String model;
    private Engine engine;
    private Tank tank;
    private Gearbox gearbox;

    public Car(Engine engine, Gearbox gearbox, int nrSeats, Tank tank, String model) {
        this.engine = engine;
        this.gearbox = gearbox;
        this.nrSeats = nrSeats;
        this.tank = tank;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void printComponents() {
        System.out.printf("I am a car with %d seats and model %s%n", nrSeats, model);
        engine.printInfo();
        gearbox.printInfo();
        tank.printInfo();
    }
}
