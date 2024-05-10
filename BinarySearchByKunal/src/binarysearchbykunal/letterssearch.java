
package binarysearchbykunal;


public class letterssearch {
    public static int Ceiling(char[]letter,char target){
        int start=0;
        int end=letter.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<letter[mid]){
                
              end=mid-1;  
            }
            else{
                
                start=mid+1;
            }
        }
      return letter[start % letter.length];
   }

 public static void main(String args[]){
        char []letter=new char[]{'a','c','d','f','g','i','k'};
        
        System.out.print("Index Position of Ceiling Number :-"+Ceiling(letter,'e'));
    }
}