package interfaces;

public interface Scannable {

    String scan();

    int getLength();

    default String getName() {
        return toString();
    }
}
