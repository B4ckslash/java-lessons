package generics;

public class Water extends Drink{

    public Water(float volume, boolean isCarbonated) {
        super(volume, 1f, isCarbonated);
    }

    public void clean() {}
}
