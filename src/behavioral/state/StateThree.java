package behavioral.state;

public class StateThree implements State {

    public void handle(Context context, char input) {
        if ( input == 't') {
            context.setState(new AcceptState());
        } else {
            context.setState(new RejectState());
        }
    }

}
