package generics;

public abstract class Drink {

    private float volume, density;
    private boolean isCarbonated;

    public Drink(float volume, float density, boolean isCarbonated) {
        this.volume = volume;
        this.density = density;
        this.isCarbonated = isCarbonated;
    }

    public void shake() {
        this.isCarbonated = false;
    }

    public void setDensity(float density) {
        this.density = density;
    }

    public float getVolume() {
        return volume;
    }

    public float getDensity() {
        return density;
    }

    public boolean isCarbonated() {
        return isCarbonated;
    }

    public Drink mixWith(Drink drink) {
        boolean isNewDrinkCarbonated = isCarbonated() || drink.isCarbonated();
        float newVolume = this.getVolume() + drink.getVolume();
        float newDensity = ((this.getDensity()*this.getVolume()) + (drink.getDensity()*drink.getVolume()))/newVolume;
        
        return new Drink(newVolume, newDensity, isNewDrinkCarbonated) {};
    }
}
