public class Printer {
    private static void print(Printable printable) {
        printable.print();
    }

    private static void printByString(Printable printable) {
        System.out.print(printable.printableString());
    }

    public static void main(String[] args) {
        Printable map = new Map(100, 100);
        Printable img = new Image();

        print(map);
        printByString(map); //this will work properly since the method has been overridden in the Map class

        print(img);
        printByString(img); //this should use the default implementation in the interface
    }
}
