package at.td.AlgoHighSecure;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        factory.getBestAlgo(Factory.OperatingSystem.APPLE).incrypeSoftware();
        factory.getBestAlgo(Factory.OperatingSystem.WINDOWS).incrypeSoftware();
        factory.getBestAlgo(Factory.OperatingSystem.LINUX).incrypeSoftware();

    }
}
