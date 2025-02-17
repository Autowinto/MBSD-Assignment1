package main;

import main.metamodel.Machine;
import main.metamodel.State;
import main.metamodel.Transition;

public class MachineInterpreter {
    private Machine machine;
    private State currentState;
    public void run(Machine m) {
        machine = m;
        currentState = m.getInitialState();
    }

    public State getCurrentState() {
        return currentState;
    }

    public void processEvent(String event) {
        for (Transition t : currentState.getTransitions()) {
            if (t.getEvent().equals(event)) {
                currentState = t.getTarget();
                return;
            }
        }

    }

    public int getInteger(String string) {
        // TODO Auto-generated method stub
        return 0;
    }

}
