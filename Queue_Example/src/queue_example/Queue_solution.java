
package queue_example;
class QueueUsingArray
{
    int front_q,rear_q;
    int capacityofqueue;
    static int[] q1;
    QueueUsingArray(int size)
    {
        capacityofqueue=size;
        q1=new int[capacityofqueue];
    }
    void enqueue(int value)
    {
       if(rear_q==capacityofqueue)
       {
           System.out.print("Queue is already full");
           
       }
       else
       {
           q1[rear_q]=value;
           rear_q++;
           
       }
    }
   
    void dequeue()
    {
        if(rear_q==0)
        {
            System.out.print("Nothing to delete");
        }
        else
        {
            for(int i=0;i<rear_q-1;i++)
            {
                q1[i]=q1[i+1];
                
            }
            rear_q--;
        }
    }
    
    void display()
    {
        if(rear_q==0)
        {
            System.out.print("Nothing to display");
            
        }
        else
        {
            for(int i=0;i<rear_q;i++)
            {
                System.out.print(q1[i]+" ");
            }
        }
}
}
public class Queue_solution
{
    public static void main(String args[])
    {
        QueueUsingArray q2=new QueueUsingArray(5);
        q2.enqueue(2);
        q2.enqueue(4);
        q2.enqueue(6);
        q2.display();
        System.out.println();
        q2.dequeue();
        q2.display();
        
    }
}
