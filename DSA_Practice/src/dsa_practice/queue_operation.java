
package dsa_practice;
class QUA
{
    int fq,rq;
    int qc;
    static int[] q1;
    QUA(int size)
    {
        qc=size;
        q1=new int[qc];
        
    }
    void enqueue(int value)
    {
        if(rq==qc)
        {
            System.out.println("Already full Queue");
        }
        else
        {
        q1[rq]=value;
        rq++;
         }
    }
    void dequeue()
    {
        if(rq==0)
        {
            System.out.print("Nothing to delete");
            
        }
        else
        {
            for(int i=0;i<rq-1;i++)
            {
                q1[i]=q1[i+1];
                
            }
            rq--;
        }
    }
    void display()
    {
        if(rq==0)
        {
            System.out.print("Nothing to display");
            
        }
        else
        {
            for(int i=0;i<rq;i++)
            {
                System.out.print(q1[i]+" ");
            }
        }
    }
}
public class queue_operation {
    public static void main(String args[])
    {
        QUA obj=new QUA(5);
        obj.enqueue(2);
        obj.enqueue(5);
        obj.enqueue(7);
        obj.display();
        System.out.println();
        obj.dequeue();
        obj.display();
    }
}
