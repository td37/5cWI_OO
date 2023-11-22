package at.td.SuperCars;

public class African implements Strategy{
    @Override
    public void inject(int amount) {
        System.out.println("The amount of  " + amount + " liter gets added to the engine ");
    }
}
