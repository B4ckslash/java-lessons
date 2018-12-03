package inheritance;

public abstract class Plant {
    private String name;
    private int age;
    private int heightCm;

    public Plant(String name) {
        this.name = name;
        this.age = 0;
        this.heightCm = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeightCm() {
        return heightCm;
    }

    public void setHeightCm(int heightCm) {
        this.heightCm = heightCm;
    }

    public abstract void grow();
}
