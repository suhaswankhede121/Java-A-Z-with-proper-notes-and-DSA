
package linkedlist;

public class DoublyLinkedList {
    Node head,tail=null;
    class Node{
        int data;
        Node next,prev;
        Node(int data){
            this.data=data;
        }
    }
    void InsertElement(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            head.prev=null;
            tail.next=null;
        }
        else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
            tail.next=null;
           
        }
    }
    void displayElement(){
        Node n1=head;
        if(head==null && tail==null){
            System.out.print("Nothing to display");
        }
        else{
            do{
                System.out.print(n1.data+" ");
                n1=n1.next;
            }while(n1!=head);
        }
    }
    public static void main(String args[]){
        DoublyLinkedList obj=new DoublyLinkedList();
        obj.InsertElement(5);
        obj.InsertElement(3);
        obj.InsertElement(2);
        obj.displayElement();
    }
}
