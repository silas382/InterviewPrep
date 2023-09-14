import java.util.List;

public class ReverseLL {

    // 1 -> 2 -> 3 -> 4
    //result : 4-> 3 -> 2 -> 1
    //currentNode
    //previousnode = null
    static class ListNode {
        int value;
        ListNode next;
        public ListNode(int value) {
            this.value = value;
        }

        public void setNext(ListNode node){
            this.next = node;
        }
    }

    public ListNode reverseLinkedList(ListNode head){

        ListNode currentNode = head;
        ListNode previousNode = null;
        ListNode currentNextNode;
        while(currentNode != null){

            currentNextNode=currentNode.next;

            currentNode.next = previousNode;

            previousNode = currentNode;

            currentNode = currentNextNode;

        }

        return previousNode;

    }

    public void printLinkedList(ListNode head){

        ListNode current = head;
        while(current != null) {
            System.out.println(current.value);
            current = current.next;

        }

    }

    public static void main(String[] args) {
        ReverseLL reverseLL = new ReverseLL();

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        ListNode node3 = new ListNode(3);
        node2.next = node3;
        ListNode node4 = new ListNode(4);
        node3.next = node4;
        reverseLL.printLinkedList(node1);
        ListNode reversedLinkedList = reverseLL.reverseLinkedList(node1);
        System.out.println("Reversed Linkedlist-------------");

        reverseLL.printLinkedList(reversedLinkedList);
    }

}
