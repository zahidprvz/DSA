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
    public Node head;
    public Node tail;
    int size;

    public Node creatSingleLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();

        node.next = null;
        node.value = nodeValue;

        head = node;
        tail = null;
        size = 1;
        
        return head;
    }
}