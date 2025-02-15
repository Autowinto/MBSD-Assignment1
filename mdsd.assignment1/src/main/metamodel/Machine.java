package main.metamodel;

import java.util.ArrayList;
import java.util.List;

public class Machine {
	private List<State> states;
	private State initialState;

	public Machine(List<State> states, State initialState) {
		this.states = states;
		this.initialState = initialState;
	}

	public List<State> getStates() {
		return states;
	}


	public State getInitialState() {
		return initialState;
	}

	public State getState(String string) {
		for (State state : states) {
			if (state.getName().equals(string)) {
				return state;
			}
		}

		throw new IllegalArgumentException("State not found: " + string);
	}

	public int numberOfIntegers() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean hasInteger(String string) {
		// TODO Auto-generated method stub
		return false;
	}
}

