package Strategy.example2.contexts;

import Strategy.example2.strategies.ArithmeticOperationsStrategy;

public class Calculator {
    private ArithmeticOperationsStrategy arithmeticOperationsStrategy;

    public Calculator() {}

    public Calculator(ArithmeticOperationsStrategy arithmeticOperationsStrategy) {
        this.arithmeticOperationsStrategy = arithmeticOperationsStrategy;
    }

    public void setArithmeticOperationsStrategy(ArithmeticOperationsStrategy arithmeticOperationsStrategy) {
        this.arithmeticOperationsStrategy = arithmeticOperationsStrategy;
    }

    public void execute(int a, int b) {
        arithmeticOperationsStrategy.performOperation(a, b);
    }
}
