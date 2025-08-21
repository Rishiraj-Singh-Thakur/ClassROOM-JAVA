
// public class LinkedListPractice {
//     class LinkedList{
//         Node head;
//         class Node{
//             String data;
//             Node next;

//             Node(String data){
//                 this.data=data;
//                 this.next=null;
//             }
//         }
//         // add at Last
//         public void add(String data){
//             Node newNode = new Node(data);
//             if(head == null){
//                 head = newNode;
//                 return;
//             }
//             Node temp = head;
//             while (temp.next!=null) {
//                 temp = temp.next;
//             }
//             temp.next=newNode;
//         }
//         public void print(){
//             Node temp = head;
//             while (temp!=null) {
//                 System.out.print(temp.data +"->");
//                 temp = temp.next;
//             }
//             System.out.print("null");
//         }
//     }
//     public static void main(String[] args) {
//         LinkedListPractice obj = new LinkedListPractice();
//         LinkedListPractice.LinkedList list = obj.new LinkedList();
//         list.add("this");
//         list.add("is");
//         list.add("a");
//         list.add("linked");
//         list.add("list");
//         list.print();

//     }
// }



// HOW TO REVERSED A LinkedList

public class LinkedListPractice{
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void reversedList(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }if (head.next==null) {
            System.out.println("list have single variable");
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode!=null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;

    }
    // print list

    public void printList(){
        Node currNode = head;
        while (currNode!=null) {
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedListPractice list = new LinkedListPractice();
        list.addFirst("4");
        list.addFirst("3");
        list.addFirst("2");
        list.addFirst("1");
        list.printList();
        list.reversedList();
        list.printList();
    }
}