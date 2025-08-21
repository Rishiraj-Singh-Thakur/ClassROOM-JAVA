public class RemoveNthNodeFromLast {
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    public void add(String data){
        Node newNode = new Node(data);
        if(head == null){
            head=newNode;
            return;
        }
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
            return;
        }
        curr.next = newNode;
    }
    public void printList(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+" --> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
public static void main(String[] args) {
    RemoveNthNodeFromLast list = new RemoveNthNodeFromLast();
    list.add("1");
    list.add("2");
    list.add("3");
    list.add("4");
    list.add("5");
    list.add("6");
    list.printList();
}
}
