package at.td.homeControl;

public class Main {
    public static void main(String[] args) {

        Thermometer thermometer = new Thermometer();
        AwningController awning = new AwningController();
        HeatingController heating = new HeatingController();

        thermometer.addObserver(awning);
        thermometer.addObserver(heating);

        thermometer.informAll();
    }
}