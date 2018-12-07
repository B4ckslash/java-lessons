package generics;

public class BottleMain {
    public static void main(String[] args) {
        Soda soda = new Soda(250f);
        Water water = new Water(250f, true);
        Bottle bottle = new Bottle(soda);

        Drink bottleContents = bottle.emptyBottle();
    }
}
