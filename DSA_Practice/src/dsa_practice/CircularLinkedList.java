
package dsa_practice;
import java.util.LinkedList;


public class CircularLinkedList {
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
                tail.next=head;
            }
        }
        
    
        void display(){
        Node n1=head;
        if(tail==null){
            System.out.println("Nothing to display");
        }
        else{
            do{
            System.out.print(n1.data);
            
        }while(n1!=head);
        
    } 
        
  } 
      
        public static void main(String args[]){
        CircularLinkedList l1=new CircularLinkedList();
        l1.InsertElement(6);
        l1.display();
    }
     
}
   