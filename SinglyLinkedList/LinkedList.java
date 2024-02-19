public class LinkedList {
    public static void main(String[] args) {
        SinglyLinkedList sLL = new SinglyLinkedList();

        sLL.createLinkedList(143);
        System.out.println(sLL.head.value);
    }
}