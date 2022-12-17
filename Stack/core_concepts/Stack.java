package Stack.core_concepts;

public class Stack {

    private int[] items = new int[100];
    private int top = -1;

    public boolean isEmpty(){
        return top < 0;
    }

    public void push (int data){
        if(top == items.length-1){

            throw new RuntimeException("Stack is Full");
        }

        items[++top]=data;
    }

    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack is Empty");

        }
        return items[top--];
    }

    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("Stack is Empty");

        }
        return items[top];
    }

    public void printStack(){
        for(int i=0; i<=top; i++){
            System.out.println(items[i]+ " ");
        }
    }
}

