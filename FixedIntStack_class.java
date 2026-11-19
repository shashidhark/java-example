/*Stack of type integer, size should be fixed, Size should be decided on creating object.*/

class FixedIntStack {
  int top;
  int[] stack;
  
  FixedIntStack(int size){
    stack = new int[size];
    top = -1;
  }
  
  void push(int item){
      System.out.println(">>> " + stack.length);
      if(stack.length - 1 == top) {
        System.out.println("Stack is full");
      } else {
        stack[++top] = item;
      }
  }
  
  int pop(){
    if(top == -1) {
        System.out.println("Stack is empty");
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
  }
}
