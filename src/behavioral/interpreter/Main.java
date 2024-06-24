package behavioral.interpreter;

public class Main {
    public static void main(String[] args) {
        // (5 + 10) - (2 + 3)
        Expression five = new NumberExpression(5);
        Expression ten = new NumberExpression(10);
        Expression two = new NumberExpression(2);
        Expression three = new NumberExpression(3);

        Expression addExpression1 = new AddExpression(five, ten); // (5 + 10)
        Expression addExpression2 = new AddExpression(two, three); // (2 + 3)

        Expression subtractExpression = new SubtractExpression(addExpression1, addExpression2); // (5 + 10) - (2 + 3)

        int result = subtractExpression.interpret();
        System.out.println("Result: " + result); // Output: Result: 10
    }
}
