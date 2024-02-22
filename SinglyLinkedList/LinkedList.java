public class LinkedList {
    public static void main(String[] args) {
        SinglyLinkedList sLL = new SinglyLinkedList();

        sLL.creatSingleLinkedList(143);     // creating linkedlist

        //System.out.println(sLL.head.value);

        sLL.insertSingleElement(108, 1);    // inserting element at index 1

        //System.out.println(sLL.head.next.value);

        sLL.insertSingleElement(34, 2);     // inserting element at last index
        //System.out.println(sLL.head.next.next.value);

        sLL.insertSingleElement(98, 3);
        sLL.insertSingleElement(117, 4); 

        sLL.singleLinkedListTraversal();

        sLL.deleteWholeLinkedList();

        sLL.singleLinkedListTraversal();

        //sLL.searchNode(35);


    }
}