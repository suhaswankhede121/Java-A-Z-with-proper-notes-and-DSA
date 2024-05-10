
package kunal_lectures;
//facebook/meta interview question 2021 
// must have to solve in O(log n) time complexity
//Que: find the first and last occurance of selected array element position
// e.g if I select target element 7 so and is {2,4}
public class facebookquestion {
    
    public int[] BinaryValue(int[]arr,int target){
        int[]ans={-1,-1};
        int start=search(arr,target,true);
        int end=search(arr,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
        
    }
    
    public static int search(int[]arr,int target,boolean searchindex){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2; //To overcome the out of range of integer value stufff
            //otherwise we can write as well mid=(start+end)/2
            if(target>arr[mid]){
                start=mid+1;
            } 
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                 ans=mid;
                if(searchindex){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
     public static void main(String args[]){
        int []arr=new int[]{2,3,7,7,7,8,8};
        int value=search(arr,7,true);
        int value1=search(arr,7,false);
        System.out.print(value+" "+value1);
        
     }
    
}
