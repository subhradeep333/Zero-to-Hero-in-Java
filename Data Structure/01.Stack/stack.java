import java.util.*;

class Stack{
    private int size;
    private int top;
    private int[] arr;
    
    public Stack(int size){
        this.size = size;
        top = -1;
        arr = new int[size];
    }

    public void push(int data){
        if(top == size -1){
            System.out.println("Stack overflow");
            return;
        }
        arr[++top] = data;
    }

    public int pop(){
        if (top == -1){
            System.out.println("Stack underflow");
            return -1;
        }
        return arr[top--];
    }

    public int peek(){
        if (top == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }
}