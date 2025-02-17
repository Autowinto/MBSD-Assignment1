package main.metamodel;

import java.util.ArrayList;
import java.util.List;

public class State {
	private String name;
	private List<Transition> transitions = new ArrayList<>();

	public State(String name) {
		this.name = name;
	}

	public Object getName() {
		return name;
	}

	public List<Transition> getTransitions() {
		return transitions;
	}
	
	public void addTransition(Transition transition) {
		transitions.add(transition);
	}

	public Transition getTransitionByEvent(String string) {
		for (Transition transition : transitions) {
			if (transition.getEvent().equals(string)) {
				return transition;
			}
		}
		
		throw new IllegalArgumentException("Transition not found: " + string);
	}
}
