public interface Printable {
    void print();
    default String printableString() {
        return this.toString();
    }
}
