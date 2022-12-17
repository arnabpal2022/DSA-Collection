package LinkedList.core_concepts;

public class LinkedList {
    Node head;  //Head of the list

    class Node {
        int data;
        Node next;
        //Constructor to create a new node, next is by default initialized as null;

        Node(int d){
            data=d;
            next=null;
        }
    }


    //We will use this method to Print the Linked List
    public void printList(){
        Node n= head;
        while (n!=null){
            System.out.println(n.data + " ");
            n=n.next;
        }

    }


    //We will use the method to push the data in front of the linked list.
    //push 3; linked list = 3 -> null
    //push 4; linked list = 4 ->3 -> null
    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next=head;
        head = new_node;
    }

    //We will use this method to insert a data in middle of a linked list
    public void insertAfter(Node prev_node, int new_data){

        if (prev_node == null) {
            System.out.println(
                    "The given previous node cannot be null");
            return;
        }

        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;

    }

    //insert a data at the last of linked list
    public void append(int new_data){
        Node new_node = new Node(new_data);

        if(head ==null){
            Node head = new Node(new_data);
            return;
        }

        new_node.next=null;

        Node last = head;
        while(last.next!=null){
            last=last.next;
        }

        last.next=new_node;
        return;
    }

    //Delete a data from linked list
    public void deleteData(int key){
        // Store head node
        Node temp = head, prev = null;

        // If head node itself holds the key to be deleted
        if (temp != null && temp.data == key) {
            head = temp.next; // Changed head
            return;
        }

        // Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // If key was not present in linked list
        if (temp == null)
            return;

        // Unlink the node from linked list
        prev.next = temp.next;


    }

    public int lengthOfLinkedList(){
        int count = 0;
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }

        return count;
    }

    //method for searching a node data in a linked list
    public boolean search(Node head, int x){
        Node current = head;
        while(current!=null){
            if(current.data==x){
                return true;

            }
            current=current.next;

        }
        return false;
    }

    //only can be used in Sorted LinkedLists
    //sorted means ascending order

    //in case of descend, we need to sort it
    public void sortedInsert(Node new_node){
        Node current;
        if(head == null || head.data>= new_node.data){
            new_node.next = head;
            head=new_node;
        }

        else {
            current = head;
            while(current.next!=null && current.next.data < new_node.data){
                current= current.next;

            }

            new_node.next=current.next;
            current.next=new_node;
        }


    }

}

