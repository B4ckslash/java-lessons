package interfaces;

public class Document implements Scannable{
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
        if(this.content == null) this.content = "";
        this.content += text;
        this.lengthChars += text.length();
    }

    @Override
    public String scan() {
        return content;
    }

    @Override
    public int getLength() {
        return lengthChars;
    }

    public void append(int i) {
        this.content += i;
    }

    public void appendLine(String text) {
        append(text);
        append(System.lineSeparator());
    }

}
