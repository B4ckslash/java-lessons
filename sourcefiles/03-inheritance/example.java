public class Dog extends Animal {
    private String type;
    
    public void bark() {
        System.out.println("woof");
    }
}
public class Cat extends Animal {
    private String favoriteFood;

    public void meow() {
        System.out.println("meow");
    }
}

public class Animal {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }
}
