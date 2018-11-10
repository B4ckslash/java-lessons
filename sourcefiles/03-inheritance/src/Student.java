public class Student extends Person{
    private String favBeer;

    public Student(String name, int age, int staffNo, String favBeer) {
        super(name, age, staffNo);
        this.favBeer = favBeer;
    }
}
