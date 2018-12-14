package generics;

public class BottleMain {
    public static void main(String[] args) {
        Soda soda = new Soda(250f);
        Water water = new Water(250f, true);
        Bottle<Water> bottle = new Bottle<Water>(water);

        Water bottleContents = bottle.emptyBottle();
        bottleContents.clean();
    }
}
