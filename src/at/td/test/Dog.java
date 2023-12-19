package at.td.test;

public class Dog implements Animal{

    private String name;
    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("I am a running dog");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
