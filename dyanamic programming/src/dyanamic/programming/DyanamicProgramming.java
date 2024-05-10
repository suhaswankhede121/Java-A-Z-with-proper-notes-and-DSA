
package dyanamic.programming;


public class DyanamicProgramming {
static void ShiftDisk(int n,char TA,char TB,char TC){
    if(n==1){
        System.out.println("Disk 1 From "+TA+" to "+TC );
    }
    else
    {
        ShiftDisk(n-1,TA,TC,TB);
        System.out.println("Disk "+n+" shifted from "+TA+" to "+TC);
        ShiftDisk(n-1,TB,TA,TC);
    }
}
   
    public static void main(String[] args) {
  int n=3;
  ShiftDisk(n,'A','B','C');
    }
    
}
