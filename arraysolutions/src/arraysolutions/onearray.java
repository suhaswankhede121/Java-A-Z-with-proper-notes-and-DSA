
package arraysolutions;

class arrays
{
    public static void main(String args[]){
      /* int[] arr=new int[6];
       int count=10;
       for(int i=0;i<arr.length;i++) //for array initializations
       {
           arr[i]=count;
           count++;
           
       }
       for(int i=0;i<arr.length;i++)  // for display array elements
       {
           System.out.print(arr[i]+ " ");
           //System.out.println(arr[i]);
       } */

      
      //CREATION OF 2D ARRAY
      
      int[][] arr=new int[3][4];
      int count1=10;
      for(int i=0;i<arr.length;i++) //Initialization of 2d array
      {
          for(int j=0;j<arr[i].length;j++)
          {
              arr[i][j]=count1;
            
              count1++;
              
          }
      }
      
      for(int i=0;i<arr.length;i++)
      {
          for(int j=0;j<arr[i].length;j++)
          {
              System.out.print(arr[i][j]+" ");
          }
          System.out.println();
         
      }
    }
}
