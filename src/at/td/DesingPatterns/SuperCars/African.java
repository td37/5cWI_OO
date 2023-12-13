package at.td.DesingPatterns.SuperCars;

public class African implements Strategy{
    @Override
    public void inject(int amount) {
        amount++;
        System.out.println("The amount of  " + amount + " liter gets added to the engine ");
    }
}
