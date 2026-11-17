
public class CommandLineDemo {
    public static void main(String[] args) {
        
        // 1. Always validate the array length to avoid ArrayIndexOutOfBoundsException
        if (args.length < 2) {
            System.out.println("Error: Please provide a name and an age.");
            System.out.println("Usage: java CommandLineDemo <name> <age>");
            return; 
        }

        // 2. Accessing a String argument
        String name = args[0];

        // 3. Converting a String argument to a number (parsing)
        try {
            int age = Integer.parseInt(args[1]);
            
            // Print the results
            System.out.println("Hello, " + name + "!");
            System.out.println("Next year, you will be " + (age + 1) + " years old.");
            
        } catch (NumberFormatException e) {
            System.out.println("Error: The second argument (age) must be a valid integer.");
        }
    }
}
