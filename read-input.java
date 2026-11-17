import java.util.Scanner;

class Main {
    public static void main(String[] args){
        String name;
        int age;
        try (Scanner scanner = new Scanner(System.in)) {
            name = scanner.nextLine(); 
            age = scanner.nextInt();
        }

        System.out.println(age + " " + name);
    }
}