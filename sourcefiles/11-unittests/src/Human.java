public class Human {

    private String forename;
    private String name;

    Human(String forename, String name){
    	if(forename == null || name == null) {
    		throw new NullPointerException();
    	}
    	if(forename.equals("") || name.equals("")) {
    		throw new IllegalArgumentException();
    	}
    	
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
