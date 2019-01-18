package abstractClasses;

import java.util.Date;

public class Student extends Person {

    public Student(int age, int heightCm, Date birthday) {
        super(age, heightCm, birthday);
    }

    @Override
    public void goToWork() {
        //TODO: implement using the Position enum in the superclass
    }
}
