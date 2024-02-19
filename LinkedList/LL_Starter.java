package LinkedList;

public class LL_Starter {
    public static void main(String[] args) {
        SingleLL sLL = new SingleLL();
     
        sLL.createSingleLL(5);

        System.out.println(sLL.head.value);
    }

    public static class Node {
        public int value;
        public Node next;
    }

    public static class SingleLL {
        public Node head;
        public Node tail;   
        public int size;        //size increased by one every time we add a node

        public Node createSingleLL(int nodeValue) {
            head = new Node();
            Node node = new Node();

            node.next = null;
            node.value = nodeValue;
            head = node;
            tail = node;
            size = 1;

            return head;    
        }
    }
}
