
package dsa_practice;

public class SinglyLikedList {
    Node head,tail;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    void InsertElement(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
            tail.next=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
            
        }
    }
    void DisplayElement(){
        Node n1=head;
        if(head==null && tail==null){
            System.out.println("Nothing to display");
        }
        else{
            do{
                System.out.print(n1.data+" ");
               n1=n1.next;
            }while(n1!=head);
        }
    }
    public static void main(String args[]){
        SinglyLikedList obj=new SinglyLikedList();
        obj.InsertElement(5);
        obj.InsertElement(6);
        obj.InsertElement(9);
        obj.DisplayElement();
        
    }
}
