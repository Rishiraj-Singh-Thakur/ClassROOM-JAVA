public class LinkedList_deleteNode {
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    // ADD NODE AT FIRST
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    // delete FIRST
    public void deleteFirst(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        head = head.next;
    }
    // delete At Last
    public void deleteLast(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        if(head.next==null){
            head = null;
            return;
        }
        Node curr = head;
        while(curr.next.next!=null){
            curr = curr.next;
        }
        curr.next = null;
    }
    // Print list
    public void printList(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode!=null) {
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("null");
        }
    public static void main(String[] args) {
        LinkedList_deleteNode list = new LinkedList_deleteNode();
        list.addFirst("list");
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        list.printList();
        // list.deleteFirst();
        // list.printList();
        list.deleteLast();
        list.printList();
    }
}
