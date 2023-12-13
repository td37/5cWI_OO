package at.td.DesingPatterns.SuperCars;

public class Main {
    public static void main(String[] args) {
        Strategy strategy = new African();
        SuperEngine engine = new SuperEngine(strategy);

        engine.usingFuel();

        engine.setStrategy(new HighAlpin());
        engine.usingFuel();
    }
}
