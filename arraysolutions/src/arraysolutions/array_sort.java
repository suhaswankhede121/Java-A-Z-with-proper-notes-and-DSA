
package arraysolutions;

import java.util.Arrays;

public class array_sort {
    
    public static int linearsearch(int arr1[],int key)
    {
        for(int i=0;i<arr1.length;i++)
        {
           
        if(arr1[i]==key)
        {
            return i;
        }
        }
        return -1;
        
    }
        
    
    
    
    public static void main(String args[])
    {
        int[] arr=new int[]{7,1,6,2,2,3,9};
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
            
        }
        System.out.println();
        
        /*Arrays.sort(arr); //predefined function for sorting array in ascending order
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
            
        }
       */
        
        int getindex=linearsearch(arr,9);
        if(getindex==-1)
        {
            System.out.println("Nothing have a element present in given array");
        }
        else
        {
            System.out.println("Now it have elements at index "+getindex);
        }
       /* int[] arr=new int[]{7,1,6,2,2,3,9};
        int temp;
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
            
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                
            }
        }
        
         for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
            
        }
*/
    }
}
