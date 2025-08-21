// import java.util.List;

public class ReversedList{
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next!=null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }
    public void printList(){
        if(head== null){
            System.out.println("list is empty");
            return;
        }
        for(Node temp=head;temp!=null;temp=temp.next){
            System.out.print(temp.data+" --> ");
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        ReversedList list = new ReversedList();
        // reversedList.LinkedList list = obj.new LinkedList();
        list.addLast("THIS");
        list.addLast("is");
        list.addLast("a");
        list.addLast("list");
        list.printList();
    }
}