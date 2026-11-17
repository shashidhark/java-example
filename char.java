class EscapeSequencesDemo1 {
    public static void main(String[] args) {
        // Quotes and Backslash Escapes
        char singleQuote = '\'';
        char doubleQuote = '\"';
        char backslash   = '\\';

        System.out.println("Single Quote: " + singleQuote);
        System.out.println("Double Quote: " + doubleQuote);
        System.out.println("Backslash:    " + backslash);

        System.out.println("---");

        // Numeric Escapes: Octal (\ddd) and Hexadecimal Unicode (\ u xxxx)
        char octalA = '\141';     // Octal 141 = Decimal 97 ('a')
        char hexA   = '\u0061';   // Hex 0061 = Decimal 97 ('a')
        char katakana = '\ua432'; // Japanese Katakana symbol

        System.out.println("Octal \\141: " + octalA);
        System.out.println("Hex \\u0061:   " + hexA);
        System.out.println("Hex \\ua432:   " + katakana);

        System.out.println("---");

        // Control Character Escapes in Action
        System.out.println("Line 1\nLine 2");             // Newline (\n)
        System.out.println("Column 1\tColumn 2");         // Tab (\t)
        System.out.println("Overwriting\rStart");          // Carriage Return (\r)
        System.out.println("AB\bC");                       // Backspace (\b - erases 'B')
    }
}