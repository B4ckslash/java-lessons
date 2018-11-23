package oop;

public class CPU {
    private String name;
    private String[] features;

    public CPU(String name, String[] features) {
        this.name = name;
        this.features = features;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
