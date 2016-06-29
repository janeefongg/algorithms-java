package linkedlist;

/**
 * Created by Jane on 6/27/16.
 */
public class DoublyLinkedNode {
    private int data;
    private DoublyLinkedNode nextNode;
    private DoublyLinkedNode previousNode;

    public DoublyLinkedNode (int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public DoublyLinkedNode getNextNode () {
        return this.nextNode;
    }

    public DoublyLinkedNode getPreviousNode () {
        return this.previousNode;
    }

    public void setData (int data) {
        this.data = data;
    }

    public void setNextNode (DoublyLinkedNode nextNode) {
        this.nextNode = nextNode;
    }

    public void setPreviousNode (DoublyLinkedNode previousNode) {
        this.previousNode = previousNode;
    }

}
