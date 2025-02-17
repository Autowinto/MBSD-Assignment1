package main.metamodel;

import java.util.List;
import java.util.Map;

public class Machine {
	private List<State> states;
	private State initialState;
	private Map<String, Integer> variables;

	public Machine(List<State> states, State initialState, Map<String, Integer> variables) {
		this.states = states;
		this.initialState = initialState;
		this.variables = variables;
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
		return variables.size();
	}

	public boolean hasInteger(String string) {
		if (variables.containsKey(string))
			return true;		
			
		return false;
	}
}

