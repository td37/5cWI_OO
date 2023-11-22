package at.td.SuperCars;

public class HighAlpin implements Strategy{
    @Override
    public void inject(int amount) {
        System.out.println("The amount of  " + amount + " liter gets added to the engine ");
    }
}
