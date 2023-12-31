import java.util.*;
public class Ex1_td1 {
    
    public static void main(String[] args) {
        Scanner cc=new Scanner(System.in);
        
        System.out.println(" veuillez entrer le nombre a ");
        int a=cc.nextInt();
         System.out.println(" veuillez entrer le nombre b ");
        int b=cc.nextInt();
         System.out.println(" veuillez entrer le nombre c ");
        int c=cc.nextInt();
        
        if(a>=b && a>=c)
            System.out.println("le maximum est : "+a);
        
        else if(b>=c)
            System.out.println("le maximum est : "+a);
        
        else
            System.out.println("le maximum est : "+c);
        
        
    }
    
}