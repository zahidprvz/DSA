/*
 * Steps to Create a Single LinkedList with one node
 * 
 * step # 1 
 * 
 * create head and tail and initialize them with null
 * 
 * step # 2
 * 
 * assign node value to nodeValue & and next reference to null as there is only one element
 * 
 * step # 3
 * 
 * Link head and tail with the node
 */




public class SinglyLinkedList {
    // step # 1
    public Node head;
    public Node tail;
    int size;

    public Node createLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();

        //step # 2
        node.next = null;
        node.value = nodeValue;
        size = 1;

        // step # 3
        head = node;
        tail = node;

        return head;
    }
}