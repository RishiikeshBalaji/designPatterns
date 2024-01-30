package behavioral.state;




// Define the Context
class Context {
    private State state;

    public Context() {
        state = new InitState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void process(char input) {
        state.handle(this, input);
    }

    public boolean isAccepted() {
        return state instanceof AcceptState;
    }

    public boolean isRejected() {
        return state instanceof RejectState;
    }
}

// Main application

