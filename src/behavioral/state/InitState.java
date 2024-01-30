package behavioral.state;

public class InitState implements State{

    public void handle(Context context, char input) {
        if (input == 'I' || input == 'i') {
            context.setState(new StateTwo());
        } else {
            context.setState(new RejectState());
        }
    }

}
