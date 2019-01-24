import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Human {

    private String forename;
    private String name;

    Human(String forename, String name){
    	assertNotNull(forename, "The given parameter forename shouldn't be null.");
    	assertNotNull(name, "The given parameter name shouldn't be null.");
    	assertFalse(forename.equals(""), "The given parameter forename shouldn't be an empty string.");
    	assertFalse(name.equals(""), "The given parameter forename shouldn't be an empty string.");
    	
        this.forename = forename;
        this.name = name;
    }


    public String getForename(){
        return forename;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return getForename() + " " + getName();
    }
}
