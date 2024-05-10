import java.util.*;
public class LList{
    Node head,tail;
     class Node
    {
        int data;
        Node next;
        Node(int getdata)
        {
            data=getdata;
        }

        void insertEle(int data)
        {
            Node newNode=new Node(data);
            if(head==null && tail==null)
            {
                head=newNode;
                tail=newNode;
                tail.next=newNode;
                
            }
            else
            {
                tail.next=newNode;
                tail=newNode;
                tail.next=head;
            }

        }
         void displayEle()
        {
            Node n1=head;
            if(head==null && tail==null)
            {
                System.out.print("Nothing to display because nothing present elements");
            }
            else{
                do
                {
                    System.out.print(n1.data+" ");
                    n1=n1.next;
                }while(n1!=head);
            }
            
        }
    
        public static void main(String args[])
        {
            LList obj=new LList();
            
            obj.insertEle(5);
            obj.displayEle();

        }
    }
    }


