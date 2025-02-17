package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import main.metamodel.Machine;
import main.metamodel.State;
import main.metamodel.Transition;

public class StateMachine {
	private List<State> states = new ArrayList<State>();
	private State initialState;
	private State currentState;
	private String currentEvent;
	private String currentOperation;
	private Transition currentTransition;
	private Map<String, Integer> variables = new HashMap<>();
	private Map<String, Integer> operations = new HashMap<>();

	private enum Operation {
		EQUALS, GREATER_THAN, LESS_THAN
	}

	private Map<> operationConditions = new HashMap<>();

	public Machine build() {
		return new Machine(states, initialState, variables);
	}

	public StateMachine state(String string) {
		State state = findOrInitState(string);
		this.currentState = state;
		return this;
	}

	public State findOrInitState(String string) {
		for (State state : states) {
			if (state.getName().equals(string)) {
				return state;
			}
		}
		State newState = new State(string);
		states.add(newState);
		return newState;
	}

	public StateMachine initial() {
		this.initialState = this.currentState;
		return this;
	}

	public StateMachine when(String string) {
		currentEvent = string;
		return this;
	}

	public StateMachine to(String string) {
		State target = findOrInitState(string);
		Transition transition = new Transition(currentEvent, target);
		currentState.addTransition(transition);
		currentTransition = transition;
		return this;
	}

	public StateMachine integer(String string) {
		variables.put(string, 0);
		return this;
	}

	public StateMachine set(String string, int i) {
		variables.put(string, i);
		return this;
	}

	public StateMachine increment(String string) {
		// TODO Auto-generated method stub
		return this;
	}

	public StateMachine decrement(String string) {
		// TODO Auto-generated method stub
		return this;
	}

	public StateMachine ifEquals(String string, int i) {
		// TODO Auto-generated method stub
		return this;
	}

	public StateMachine ifGreaterThan(String string, int i) {
		// TODO Auto-generated method stub
		return this;
	}

	public StateMachine ifLessThan(String string, int i) {
		// TODO Auto-generated method stub
		return this;
	}

}
