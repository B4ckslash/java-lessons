package generics;

public abstract class Drink {

    private float volumeMilliliter, density;
    private boolean isCarbonated;

    public Drink(float volume, float density, boolean isCarbonated) {
        this.volumeMilliliter = volume;
        this.density = density;
        this.isCarbonated = isCarbonated;
    }

    public void shake() {
        this.isCarbonated = false;
    }

    public void setDensity(float density) {
        this.density = density;
    }

    public float getVolumeMilliliter() {
        return volumeMilliliter;
    }

    public float getDensity() {
        return density;
    }

    public boolean isCarbonated() {
        return isCarbonated;
    }

    public Drink mixWith(Drink drink) {
        boolean isNewDrinkCarbonated = isCarbonated() || drink.isCarbonated();
        float newVolume = this.getVolumeMilliliter() + drink.getVolumeMilliliter();
        float newDensity = ((this.getDensity()*this.getVolumeMilliliter()) + (drink.getDensity()*drink.getVolumeMilliliter()))/newVolume;
        
        return new Drink(newVolume, newDensity, isNewDrinkCarbonated) {};
    }
}
