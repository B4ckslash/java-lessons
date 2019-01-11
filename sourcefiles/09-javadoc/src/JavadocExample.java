
public class JavadocExample {

    private String content;
    private boolean isDebugOutput;

    public JavadocExample(String content, boolean isDebugOutput) {
        this.content = content;
        this.isDebugOutput = isDebugOutput;
    }

    public JavadocExample(String content) {
        this(content, false);
    }
}
