
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Negative input is not considered here.");
        }
        int original = n, reverse = 0;
        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }
        if (original == reverse) {
            System.out.println("Palindrome"); 
        }else {
            System.out.println("Not a palindrome");
        }
    }
}
