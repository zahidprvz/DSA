public class SinglyLinkedList {
    public Node head;
    public Node tail;
    int size;

    public Node creatSingleLinkedList(int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;
        node.next = null;

        head = node;
        tail = node;
        size = 1;

        return node;
    }

    public void insertSingleElement(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;

        if (head == null) { // if linkedlist does not exist
            creatSingleLinkedList(nodeValue);
            return;
        } else if (location == 0) { // if we want to insert at beginning
            node.next = head;
            head = node;
        } else if (location >= size) { // if we want to insert at last
            node.next = null;
            tail.next = node;
            tail = node;
        } else { // if we want to insert at any specific location
            Node tempNode = head;
            int index = 0;

            while (index < location - 1) { // fix the condition here
                tempNode = tempNode.next;
                index++;
            }

            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++; // increase size of linkedlist by 1 after inserting an element
    }

    // SingleLinkedList Traversal
    public void singleLinkedListTraversal() {
        if (head == null) {
            System.out.println("LL does not exist!");
        } else {
            Node tempNode = head;

            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" --> ");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("\n");
    }

    // searching in single linkedlist
    boolean searchNode(int nodeValue) {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.print("Element found at: " + i + "th index\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found in LL!");
        return false;
    }

    // Deleting an element from linkedlist
    public void deleteNode(int location) {
        if (head == null) {
            System.out.print("LinkedList does not exit!");
            return;
        } else if (location == 0) { // delete from beginning
            head = head.next;
            size--;
            if (size == 0) { // if only one element, then tail point to null to delete whole LL
                tail = null;
            }
        } else if (location >= size) { // to delete last element
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head) {
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        } else { // to delete any specific element
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    // delete whole single linkedlist
    public void deleteWholeLinkedList() {
        head = null;
        tail = null;
        System.out.println("Single LL deleted successfully! ");
    }
}
