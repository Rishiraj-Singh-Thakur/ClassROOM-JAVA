// import java.util.LinkedList;
public class LL{
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    // ADD FIRST , LAST
    public void  addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    // ADD LAST
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        // traverse
        Node curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.next = null;
    }
    // PRINT LIST
    public void printList(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr =curr.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LL obj = new LL();
        // LL.Node list = obj.new Node();
        obj.addFirst("a");
        obj.addFirst("is");
        obj.addFirst("this");
        obj.printList();
        obj.addLast("list");
        obj.printList();
    }
}