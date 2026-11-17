class PolymorphicStack {
    private int[] intStack = new int[10];
    private double[] doubleStack = new double[10];
    private char[] charStack = new char[10];

    private int intTop = -1, doubleTop = -1, charTop = -1;

    // Same interface name 'push' used for all data types
    public void push(int item) {
        intStack[++intTop] = item;
        System.out.println("Pushed int: " + item);
    }

    public void push(double item) {
        doubleStack[++doubleTop] = item;
        System.out.println("Pushed double: " + item);
    }

    public void push(char item) {
        charStack[++charTop] = item;
        System.out.println("Pushed char: '" + item + "'");
    }
}

public class Main {
    public static void main(String[] args) {
        PolymorphicStack stack = new PolymorphicStack();

        // One interface name ('push') handles all situations
        stack.push(42);         // Compiler invokes push(int)
        stack.push(3.14159);    // Compiler invokes push(double)
        stack.push('A');        // Compiler invokes push(char)
    }
}

