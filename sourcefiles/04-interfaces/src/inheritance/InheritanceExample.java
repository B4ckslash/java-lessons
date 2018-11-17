import java.io.BufferedReader;
import java.io.StringReader;

public class InheritanceExample extends BufferedReader {
    public String name;

    public InheritanceExample(String name) {
        super(new StringReader("Hi I am a String"));
        this.name = name;
    }
}
