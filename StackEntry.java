/*Stack of type integer, size should be fixed, Size should be decided on creating object.*/
interface StackInterface {
  public void push(int item);
  public int pop();
}

class FixedIntStack implements StackInterface {
  int top;
  int[] stack;
  
  FixedIntStack(int size){
    stack = new int[size];
    top = -1;
  }
  
  public void push(int item){
      if(stack.length - 1 == top) {
        System.out.println("Stack is full");
      } else {
        stack[++top] = item;
      }
  }
  
  public int pop(){
    if(top == -1) {
        System.out.println("Stack is empty");
        return -1;
    } else {
      return stack[top--];
    }
  }
}

class DynamicIntStack implements StackInterface {
  int top;
  int[] stack;
  
  DynamicIntStack(int size){
    stack = new int[size];
    top = -1;
  }
  
  public void push(int item){
      if(stack.length - 1 == top) {
        System.out.println("Current stack is full, Increasing stack size");
        //Create new array, size * 2, Copy all the elements from stack, Point current array to new array.
        int[] newArray = new int[stack.length * 2];
        for(int i=0; i <= stack.length -1; i++){
          newArray[i] = stack[i];
        }
        stack = newArray;
        stack[++top] = item;
      } else {
        stack[++top] = item;
      }
  }
  
  public void display(){
    System.out.println("Current stack size is : " + stack.length);
    System.out.print("Current stack Elements : ");
    for(int i=0; i <= stack.length -1; i++){
      System.out.print(" - " + stack[i]);
    }
    System.out.println();
  }
  
  public int pop(){
    if(top == -1) {
        System.out.println("Stack is empty");
        return -1;
    } else {
      return stack[top--];
    }
  }
}

public class StackEntry{
  public static void main(){
    FixedIntStack fStack1 = new FixedIntStack(2);
    FixedIntStack fStack2 = new FixedIntStack(4);
    
    //Case 1
    fStack1.push(12);
    fStack1.push(3);
    fStack1.push(13);
    System.out.println("->"+fStack1.pop());
    System.out.println("->"+fStack1.pop());
    System.out.println("->"+fStack1.pop());
    
    System.out.println()
    
  }
}
