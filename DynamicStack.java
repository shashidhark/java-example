/*
Dynamic stack
*/

interface StackInterface {
  public void push(int item);
  public int pop();
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

public class DynamicStack{
  public static void main(){
    DynamicIntStack dStack1 = new DynamicIntStack(2);
    
    //Case 1
    dStack1.push(12);
    dStack1.display();
    dStack1.push(3);
    dStack1.display();
    dStack1.push(13);
    dStack1.display();
  }
}
