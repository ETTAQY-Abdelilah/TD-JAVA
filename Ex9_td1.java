import java.util.*;
public class Ex9_td1 {
    
    public static void main(String[] args) {
        
         Scanner cc=new Scanner(System.in);
        
        System.out.println(" veuillez entrer le nombre a ");
        int a=cc.nextInt();
         System.out.println(" veuillez entrer le nombre b ");
        int b=cc.nextInt();
        if(a>b)
        System.out.println(a+" > "+b);
        
        else if(a<b)
        System.out.println(b+" > "+a);
            else
        System.out.println(a+" = "+b);
    }
    
}