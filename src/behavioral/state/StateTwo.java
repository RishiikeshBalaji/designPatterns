package behavioral.state;

public class StateTwo implements State{

    public void handle(Context context, char input) {
        if (input == 'N' || input == 'n') {
            context.setState(new StateThree());
        } else {
            context.setState(new RejectState());
        }
    }

}
