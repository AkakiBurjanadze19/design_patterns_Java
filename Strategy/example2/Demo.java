package Strategy.example2;

import Strategy.example2.contexts.Calculator;
import Strategy.example2.strategies.*;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter the second number: ");
        int secondNumber = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter the operation to perform: ");
        char operation = scanner.next().charAt(0);

        Calculator calculator = new Calculator();

        if (operation == '+') {
            AddStrategy addStrategy = new AddStrategy();
            calculator.setArithmeticOperationsStrategy(addStrategy);
        } else if (operation == '-') {
            SubtractStrategy subtractStrategy = new SubtractStrategy();
            calculator.setArithmeticOperationsStrategy(subtractStrategy);
        } else if (operation == '*') {
            MultiplyStrategy multiplyStrategy = new MultiplyStrategy();
            calculator.setArithmeticOperationsStrategy(multiplyStrategy);
        } else if (operation == '/') {
            DivideStrategy divideStrategy = new DivideStrategy();
            calculator.setArithmeticOperationsStrategy(divideStrategy);
        } else if (operation == '%') {
            ModulusStrategy modulusStrategy = new ModulusStrategy();
            calculator.setArithmeticOperationsStrategy(modulusStrategy);
        } else {
            System.err.println("Such an option doesn't exist!");
        }

        System.out.print("result: ");
        calculator.execute(firstNumber, secondNumber);
    }
}
