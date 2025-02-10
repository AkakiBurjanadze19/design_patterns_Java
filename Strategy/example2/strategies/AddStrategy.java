package Strategy.example2.strategies;

/* Concrete example of an arithmetic operation strategy  */
public class AddStrategy implements ArithmeticOperationsStrategy {
    @Override
    public void performOperation(int a, int b) {
        System.out.println(a + b);
    }
}
