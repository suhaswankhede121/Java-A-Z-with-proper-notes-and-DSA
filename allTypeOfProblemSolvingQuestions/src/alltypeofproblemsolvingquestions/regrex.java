import java.util.*;
public class regrex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter mail Id");
        String mail=sc.next();
        String regex="^[a-zA-Z0-9_.-]+@[a-zA-Z0-9_.]$";
        boolean result=mail.matches(regex);
        if(result){
            System.out.println("Valid Mail");
        }else{
            System.out.println("Invalid");
        }
    }
}
