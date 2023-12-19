package at.td.test;

public class Cat implements Animal{
    private String name;

    public Cat(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println("I am a running cat");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
