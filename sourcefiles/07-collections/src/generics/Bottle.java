package generics;

public class Bottle {
    private Drink drink;

    public Bottle(Drink drink) {
        this.drink = drink;
    }

    public Drink emptyBottle() {
        Drink ret = this.drink;
        this.drink = null;
        return ret;
    }

    public void fillWith(Drink drink) {
        this.drink = drink;
    }
}
