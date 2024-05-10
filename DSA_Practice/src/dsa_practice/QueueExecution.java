
package dsa_practice;


public class QueueExecution {
        int front_Q,rear_Q;
        int CapacityOfQueue;
        static int[]q1;
        QueueExecution(int size){
            CapacityOfQueue=size;
            q1=new int[CapacityOfQueue];
        }
        void enqueue(int values){
            if(rear_Q==CapacityOfQueue){
                System.out.print("already full");
            }
            else {
               
                    q1[rear_Q]=values;
                    rear_Q++;
            }
        }
        void dequeue(){
            if(rear_Q==0){
                System.out.print("Nothing to delete");
            }
            else {
                for(int i=0;i<rear_Q-1;i++){
                    q1[i]=q1[i+1];    
                }
                rear_Q--;
                    
            }
        }
       void display(){
           if(rear_Q==0){
               System.out.print("Nothing to display");
           }
           else {
               for(int i=0;i<rear_Q;i++){
                   System.out.print(q1[i]+" ");
               }
           }
       }
        public static void main(String args[]){
            QueueExecution obj=new QueueExecution(3);
            obj.enqueue(4);
            obj.enqueue(2);
            obj.enqueue(1);
            
            obj.display();
            System.out.println();
            obj.dequeue();
            obj.display();
        }
                
    
}
