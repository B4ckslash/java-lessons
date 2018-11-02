public class Main {
    public static void main(String[] args) {
        Car car = new Car(new Engine(4, 120),
                    new Gearbox(5),
                    4,
                    new Tank(0.5f),
                    "TestCar model 42");
        car.printComponents();
    }
}


