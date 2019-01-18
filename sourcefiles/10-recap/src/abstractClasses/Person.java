package abstractClasses;

import java.util.Date;

public abstract class Person {
    private int age, heightCm;
    private Date birthday;
    private Position location;

    public Person(int age, int heightCm, Date birthday) {
        //TODO: Throw exception when age or height < 0
        this.age = age;
        this.heightCm = heightCm;
        this.birthday = birthday;
        this.location = Position.HOME;
    }

    public int getHeightCm() { return this.heightCm; }
    public void setHeightCm(int heightCm) {
        //TODO: Throw exception when height < 0
        this.heightCm = heightCm;
    }

    public void getOlder() { this.age++; }

    public abstract void goToWork();

    protected enum Position{
        HOME,WORK;
    }

    public Position getPosition() { return  this.location; }
    public void goTo(Position position) {
        this.location = position;
    }
}
