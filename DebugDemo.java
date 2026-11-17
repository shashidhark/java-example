/*
 * A simple program for practicing the debugger.
 * Put a breakpoint on the call in main, then step into doubleNumber().
 */
class DebugDemo {

    static int doubleNumber(int number) {
        int result = number * 2; // Set a breakpoint here to inspect variables.
        return result;
    }

    public static void main(String[] args) {
        int value = 5;
        int doubledValue = doubleNumber(value); // Step into this function call.
        System.out.println("Doubled value: " + doubledValue);
    }
}
