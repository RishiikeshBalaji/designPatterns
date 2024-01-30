package behavioral.state;

class AcceptState implements State {
    public void handle(Context context, char input) {
        context.setState(new RejectState());
    }
}