package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;

public class PowerOperator extends Operator {
    private int priorityNumber = 3;

    @Override
    public int priority(){
        return priorityNumber;
    }

    @Override
    public Operand execute(Operand op1, Operand op2) {
        return new Operand( (int) Math.pow( op1.getValue(), op2.getValue() ) );
    }
}
