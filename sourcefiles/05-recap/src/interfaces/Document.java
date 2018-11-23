package interfaces;

public class Document {
    private String content;
    private int lengthChars;
    private String title;

    public Document(String title, int lengthChars, String content) {
        if(title == null || lengthChars < 0 || title.isEmpty()) throw new IllegalArgumentException();
        this.content = content;
        this.title = title;
        this.lengthChars = lengthChars;
    }

    public void append(String text) {
        this.content += text;
        this.lengthChars += text.length();
    }

    public void append(int i) {
        this.content += i;
    }

    public void appendLine(String text) {
        append(text);
        append(System.lineSeparator());
    }

}
