import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TaxiTest_ToFill {
    private String result0, result1, result2, result3, result4;

    //TODO: declare some human test subjects and a taxi

    @BeforeEach
    public void setUp() {
    	
    	/*
    	 * Feel free to use these test results.
    	 * It's just to save you some time but you are not required to use them.
    	 */
    	
    	result0 = "This is the taxi of Lenard Baum. He takes nobody along.";
    	result1 = "This is the taxi of Lenard Baum. He takes Max Biber along.";
    	result2 = "This is the taxi of Lenard Baum. He takes Max Biber and Caro Meiser along.";
    	result3 = "This is the taxi of Lenard Baum. He takes Max Biber, Caro Meiser and Paul Gerst along.";
    	result4 = "This is the taxi of Lenard Baum. He takes Max Biber, Caro Meiser, Paul Gerst and Manni Urst along.";
    	
    	//TODO: initialize some human test subjects and a taxi (with a driver)
    }

    @Test
    public void testHuman() {
    	/* TODO: test all methods of the Human Class (getForename(),getName(),toString())
    	 * 
    	 * toString() should return a String which contains the forename and name of the human like this "Maximilian Huber"
    	 */
    	
    	//TODO: check if the the constructor of the Human Class throws IllegalArgumentExceptions when given illegal arguments
    }


    @Test
    public void testTaxiAdd() {
        /* TODO: test if the add() method of the Taxi Class works properly. You can use the toString() and length() method
         * 
         * add() should behave like this:
         * 
         * Each taxi can transport up to four passengers plus its driver. The Taxi class has the method add(Human x) to add a new passenger. 
         * If the taxi is full, the method doesn’t add the passenger
         * Then it should print: 
         * "We are sorry, Lucky Luke. The taxi is full." 
         * Otherwise the passenger is added and another message is printed:
         * "Lucky Luke gets in."
         */    	
    	
        //TODO: test if really no more than 4 passengers can enter the taxi
    }

    @Test
    public void taxiAllGetOutTaxiNotEmpty() {
    	//TODO: setUp a test taxi with four passengers
    	
        //TODO: test if Taxi.allGetOut() returns four passengers when the taxi has four passengers
    	
    	//TODO: test if the taxi is empty after allGetOut()
        
        //TODO: test if all passengers are actual humans and if they are the same as the ones you added at the setUp
    }
}
