
import java.util.Scanner;

class Student {

    private final String usn;
    private final String name;

    Student(String usn, String name) {
        this.usn = usn;
        this.name = name;
    }

    void display() {
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String usn = sc.nextLine();
        Student s = new Student(usn, name);
        s.display();
    }
}
