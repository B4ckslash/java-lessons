package generics;

public class Bottle<T extends Drink> {
    private T drink;

    public Bottle(T drink) {
        this.drink = drink;
    }

    public T emptyBottle() {
        T ret = this.drink;
        this.drink = null;
        return ret;
    }

    /*public void fillWith(T drink) {
        if(this.drink != null) {
            T newDrink = this.drink.mixWith(drink);
            this.drink = newDrink;
        } else {
            this.drink = drink;
        }
    }*/
}
