public class Taxi {
    private Human driver;
    private int content=0;
    private String buffercontent;
    public Human[] taxicontent = new Human[4];

    Taxi(Human driver){
        this.driver = driver;
    }

    public String getDriverName(){
        return driver.getForename() + " " + driver.getName();
    }

    public void add(Human x){
        if(content < 4){
            taxicontent[content] = x;
            content = content + 1;
            System.out.println(x.getForename() + " " + x.getName() + " gets in.");
        }
        else{
            System.out.println("We are sorry, " + x.getForename() + " " + x.getName() + ". The taxi is full.");
        }
    }

    public String toString(){
        if(content == 0){
            return "This is the taxi of " + getDriverName() + ". He takes nobody along.";
        }
        if(content == 1){
            return "This is the taxi of " + getDriverName() + ". He takes " + taxicontent[content-1].getForename() + " " + taxicontent[content-1].getName() + " along.";
        }
        if(content > 1){
            if(taxicontent[0] != null){
                buffercontent = taxicontent[0].getForename() + " " + taxicontent[0].getName();
                if(taxicontent[1] != null){
                    if(taxicontent[2] == null){
                        buffercontent = buffercontent + " and " + taxicontent[1].getForename() + " " + taxicontent[1].getName();
                    }
                    else {
                        buffercontent = buffercontent + ", " + taxicontent[1].getForename() + " " + taxicontent[1].getName();
                    }
                    if(taxicontent[2] != null){
                        if(taxicontent[3] == null){
                            buffercontent = buffercontent + " and " + taxicontent[2].getForename() + " " + taxicontent[2].getName();
                        }
                        else {
                            buffercontent = buffercontent + ", " + taxicontent[2].getForename() + " " + taxicontent[2].getName();
                        }
                        if(taxicontent[3] != null){
                            buffercontent = buffercontent + " and " + taxicontent[3].getForename() + " " + taxicontent[3].getName();
                        }
                    }
                }
            }
        }
        return "This is the taxi of " + getDriverName() + ". He takes " + buffercontent + " along.";
    }
    public Human[] allGetOut(){
        content = 0;
        if(taxicontent[3] != null){
            return taxicontent;
        }
        Human[] taxicontent00 = new Human[0];
        return taxicontent00;
    }
}

