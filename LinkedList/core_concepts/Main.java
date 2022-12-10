package LinkedList.core_concepts;

//Used as Drivers' Code

public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.push(3);
        list.push(6);
        list.push(69);
        list.insertAfter(list.head,9);
        list.append(500);
        list.deleteData(9);

        list.printList();
        System.out.println(list.lengthOfLinkedList());
    }
}
