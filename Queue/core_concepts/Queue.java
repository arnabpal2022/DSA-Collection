package Queue.core_concepts;

public class Queue {
    private int[] items = new int[100];
    private int head = -1;
    private int tail = -1;
    private int numOfItems=0;

    public boolean isFull() {
        return numOfItems == items.length;
    }

    public boolean isEmpty() {
        return numOfItems == 0;
    }

    public void enqueue(int item){
        if(isFull()){
            throw new RuntimeException("Queue is Full");
        }
        if(tail == items.length-1){
            tail= -1;
        }
        items[++tail] = item;
		if (head == -1) {
            head++;
        }
        numOfItems++; // add 1 to the item count

    }

    public int dequeue() {
        if (isEmpty())
            throw new RuntimeException("Queue is empty");
        if (head == items.length-1)
            head = -1;
        numOfItems--;
        return items[++head];
    }


}
