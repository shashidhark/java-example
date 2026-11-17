class ModulusAssignmentDemo {
    public static void main(String[] args) {
        int x = 27;
        int y = 5;

        // Perform x %= y (equivalent to x = x % y)
        // 27 divided by 5 is 5 with a remainder of 2
        x %= y; 

        System.out.println("Result of x %= 5: " + x); // Outputs: 2

        // Practical Use Case: Cycling numbers / clock arithmetic
        int hour = 11;
        hour += 4; 
        hour %= 12;

        System.out.println("New hour (12-hour format): " + hour); // Outputs: 3
    }
}