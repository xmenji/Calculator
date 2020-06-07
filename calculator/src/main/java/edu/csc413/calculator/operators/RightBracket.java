package edu.csc413.calculator.operators;

public class RightBracket extends Operator{
    private int priorityNumber = 1;

    @Override
    public int priority() {
        return priorityNumber;
    }
}
