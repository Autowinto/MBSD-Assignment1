package main;

import main.metamodel.Machine;
import main.metamodel.State;

public class MachineInterpreter {
    private Machine currentMachine;
    public void run(Machine m) {
        this.currentMachine = m;
    }

    public State getCurrentState() {
    }

    public void processEvent(String string) {
        // TODO Auto-generated method stub

    }

    public int getInteger(String string) {
        // TODO Auto-generated method stub
        return 0;
    }

}
