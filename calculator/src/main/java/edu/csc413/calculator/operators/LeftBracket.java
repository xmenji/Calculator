package edu.csc413.calculator.operators;

public class LeftBracket extends Operator{
    private int priorityNumber = 0;

    @Override
    public int priority() {
        return priorityNumber;
    }
}
