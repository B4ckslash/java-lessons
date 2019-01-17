/**
 * This is an example class for Javadoc.
 * @author marcus
 * @since 1.10
 * @version 1.1
 */
public class JavadocExample {

    private int a, b;
    /**
     * The String content of this logger
     */
    private String content;
    private boolean isDebugOutput;

    /**
     * Basic constructor for Example
     * @param content The content
     * @param isDebugOutput
     */
    public JavadocExample(String content, boolean isDebugOutput) {
        this.content = content;
        this.isDebugOutput = isDebugOutput;
    }

    /**
     * Basic constructor for Example, assumes this is not a debug logger
     * @param content
     */
    public JavadocExample(String content) {
        this(content, false);
    }
}
