
import java.util.Scanner;

interface FixedStack01 {
    void push(int item);
    int pop();
};

class FixedStackClass implements FixedStack01 {
    private int[] stack;
    private int top = -1;

    FixedStackClass(int size) {
        stack = new int[size];
    }
    
    public int pop() {
        if(top < 0){
            System.out.println("Stack is empty");
            return 0;
        }
        return stack[top--];
    }

    public void push(int item) {
        stack[++top] = item;
    }
}

class DynamicStackClass implements FixedStack01 {
    private int[] stack;
    private int top = -1;

    DynamicStackClass(int size) {
        stack = new int[size];
    }
    
    public int pop() {
        if(top < 0){
            System.out.println("Stack is empty");
            return 0;
        }
        return stack[top--];
    }

    public void push(int item) {
        if(stack.length - 1 == top){
            int[] newStack = new int[stack.length * 2];
            for(int i=0; i<stack.length; i++){
                newStack[i] = stack[i];
            }
            newStack[++top] = item;
            stack = newStack;
            System.out.println("Stack size increased!");
        } else {
            stack[++top] = item;
        }
    }
}

public class FixedStack {
    public static void main(String arg[]){


        Scanner sc = new Scanner(System.in);
        int a;
        FixedStackClass fc = new FixedStackClass(5);
        DynamicStackClass ds1 = new DynamicStackClass(2);
        do { 
            System.out.println("Enter your option: ");
            System.out.println("1. Fixed Stack");
            System.out.println("2. Dynamic Stack");
            System.out.println("0. Exit");
            a = sc.nextInt();
            if(a == 1){
                System.out.println("Enter your option: ");
                System.out.println("1. Push");
                System.out.println("2. Pop");
                System.out.println("0. Exit");
                a = sc.nextInt();
                switch(a){
                    case 1:
                        System.out.println("Enter the number to push: ");
                        int num = sc.nextInt();
                        fc.push(num);
                        break;
                    case 2:
                        System.out.println("Popped number is: " + fc.pop());
                        break;
                    case 0:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid option");
                }
            } else if(a == 2){
                System.out.println("Enter your option: ");
                System.out.println("1. Push");
                System.out.println("2. Pop");
                System.out.println("0. Exit");
                a = sc.nextInt();
                switch(a){
                    case 1:
                        System.out.println("Enter the number to push: ");
                        int num = sc.nextInt();
                        ds1.push(num);
                        break;
                    case 2:
                        System.out.println("Popped number is: " + ds1.pop());
                        break;
                    case 0:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid option");
                }
            } else if(a == 0){
                System.out.println("Exiting...");
            } else {
                System.out.println("Invalid option");
            }
        } while (a != 0);

    }
}