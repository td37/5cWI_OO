package at.td.DesingPatterns.SuperCars;

public class SuperEngine implements Engine{

    private Strategy strategy;

    public SuperEngine(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void usingFuel() {
        this.strategy.inject(17);
        System.out.println("I'm driving, therefore I need fuel!");
    }

}
