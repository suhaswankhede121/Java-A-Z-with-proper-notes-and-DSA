import java.util.*;

class Staticconstructorcheck{
    public static void main(String []args){
        float sper=0.0f;
        String sname=null;
        int range;
        float maxper=0.0f;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter How Many Students do u want to add");
        range=sc.nextInt();
        while(range-->0){
           System.out.println("Percentage of Students"); 
           sper=sc.nextFloat();
           System.out.println("Name of Students");
           sname=sc.next();
           if(sper>=maxper){
            maxper=sper;
            sname+=sname;
           } 
        }
        System.out.println("Maximum percentage is=" +maxper+" Name of Student= "+sname);
    }
}