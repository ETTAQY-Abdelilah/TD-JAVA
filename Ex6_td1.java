import java.util.*;
public class Ex6_td1 {
    
    public static void main(String[] args) {
       Scanner cc=new Scanner(System.in);
        
        System.out.println(" veuillez entrer le nombre a ");
        int a=cc.nextInt();
         System.out.println(" veuillez entrer le nombre b ");
        int b=cc.nextInt();
        
        
        if(a>=0 && b>=0)
            System.out.println(a*b+" : est positive ");
        
        else if(a>=0 && b<0)
            System.out.println(a*b+" : est negative");
        
            else if(a<0 && b<0)
            System.out.println(a*b+" : est positive ");
        
          if(a<0 && b>=0)
            System.out.println(a*b+" : est negative ");
    }
    
}