class NumberSystemsDemo1 {

    // Static initialization of variables using different number systems
    static int decimalNumber = 45;          // Standard base 10
    static int binaryNumber = 0b101101;     // Base 2 (Prefix 0b)
    static int octalNumber = 055;           // Base 8 (Prefix 0)
    static int hexadecimalNumber = 0x2D;    // Base 16 (Prefix 0x)

    public static void main(String[] args) {
        System.out.println("=== Statically Initialized Values ===");
        
        // Print out the standard decimal representation stored by Java
        System.out.println("Decimal representation of 'decimalNumber': " + decimalNumber);
        System.out.println("Decimal representation of 'binaryNumber':  " + binaryNumber);
        System.out.println("Decimal representation of 'octalNumber':   " + octalNumber);
        System.out.println("Decimal representation of 'hexadecimalNumber': " + hexadecimalNumber);

        System.out.println("\n=== Dynamic Conversion Output ===");
        // You can also use built-in methods to convert a decimal back into specific string representations
        int testValue = 45;
        System.out.println("Integer value: " + testValue);
        System.out.println("To Binary string: " + Integer.toBinaryString(testValue));
        System.out.println("To Octal string:  " + Integer.toOctalString(testValue));
        System.out.println("To Hex string:    " + Integer.toHexString(testValue).toUpperCase());
    }
}
