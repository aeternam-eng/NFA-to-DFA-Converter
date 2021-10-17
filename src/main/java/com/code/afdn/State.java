package com.code.afdn;

import java.util.List;

public class State implements Comparable<State> {
    public int id;
    public String name;
    public StateType type = StateType.Normal;
    public List<State> innerStates;

    public State(int id, String name, StateType type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public State(int id, String name, StateType type, List<State> innerStates) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.innerStates = innerStates;
    }

    public boolean isInitial() {
        return type == StateType.Initial || type == StateType.Both;
    }

    public boolean isFinal() {
        return type == StateType.Final || type == StateType.Both;
    }

    public int compareTo(State state) {
        return id - state.id;
    }

    @Override
    public String toString() {
        return "State [\n\t\tname=" + name + ", \n\t\ttype=" + type + "\n\t]";
    }
}
