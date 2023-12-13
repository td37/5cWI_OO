package at.td.DesingPatterns.homeControl;

public class HeatingController implements Observer{

    @Override
    public void informTempOver20() {
        System.out.println("Turn off Heating");
    }
}
