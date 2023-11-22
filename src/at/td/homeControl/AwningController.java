package at.td.homeControl;

public class AwningController implements Observer{

    @Override
    public void informTempOver20() {
        System.out.println("open awning");
    }
}
