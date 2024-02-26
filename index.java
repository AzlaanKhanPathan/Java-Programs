class Calculator {
    private CalculatorOperations operations = new CalculatorOperations();

    void performAddition(int x, int y){
        int result = operations.add(x,y);
        System.out.println("Addition of two numbers = " + result);
    }

    void performSubtraction(int x, int y) {
        int result = operations.subtract(x, y);
        System.out.println("Subtraction of two numbers = " + result);
    }

    void performMultiplication(int x, int y) {
        int result = operations.multiply(x, y);
        System.out.println("Multiplication of two numbers = " + result);
    }

    void performDivision(int x, int y) {
        int result = operations.divide(x, y);
        System.out.println("Division of two numbers = " + result);
    }

    class CalculatorOperations {

        int add(int a , int b){
            return a + b;
        }
        int subtract(int a, int b) {
            return a - b;
        }

        int multiply(int a, int b) {
            return a * b;
        }

        int divide(int a, int b) {
            return a / b;
        }
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.performAddition(5,8);
        c.performSubtraction(1, 2);
        c.performMultiplication(1, 2);
        c.performDivision(1, 2);
    }
}