public class Map implements Printable{
    private int widthMillis, heightMillis;

    public Map(int widthMillis, int heightMillis)  {
        this.heightMillis = heightMillis;
        this.widthMillis = widthMillis;
    }

    @Override
    public void print() {
       System.out.println("I am a Map with dimensions " + widthMillis + "mm x " + heightMillis + "mm.");
    }

    @Override
    public String printableString() {
        String ret = String.format("I am the printable String of a map with dimensions %dmm x %dmm.%n", widthMillis, heightMillis);
        return ret;
    }

    public void setWidthMillis(int widthMillis) {
        this.widthMillis = widthMillis;
    }
}
