package at.td.SuperCars;

public class EngineCar implements Engine{

    private Strategy strategy;

    public EngineCar(Strategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void usingFuel() {
        System.out.println("I'm driving, therfore I need fuel!");
    }

}
