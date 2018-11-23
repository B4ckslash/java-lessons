package interfaces;

public class Scanner {
    public static void main(String[] args) {
        Scannable scannable1, scannable2;
        Document pureTextDocument = new PureTextDocument(0, null, "Test");
        pureTextDocument.appendLine("Test");

        scannable1 = new Document("ScannableDoc", 4, "scan");
        scannable2 = pureTextDocument;

        System.out.println(scannable1.scan());
        System.out.println(scannable2.scan());
    }
}
