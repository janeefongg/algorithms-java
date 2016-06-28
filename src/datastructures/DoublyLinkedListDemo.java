package datastructures;

/**
 * Created by Jane on 6/27/16.
 */
public class DoublyLinkedListDemo {
    public static void main (String[] args) {
        DoublyLinkedList numbers = new DoublyLinkedList();

        numbers.insertAtHead(5);
        numbers.insertAtHead(11);
        numbers.insertAtHead(2);
        numbers.insertAtHead(8);
        numbers.insertAtHead(10);
        numbers.insertAtHead(25);
        numbers.insertAtHead(9);

        System.out.println(numbers);
    }
}
