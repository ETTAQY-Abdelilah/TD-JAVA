import java.util.*;
public class Ex2_td1 {
    
    public static void main(String[] args) {
              Scanner cc=new Scanner(System.in);
        
        System.out.println(" veuillez entrer le nombre a ");
        int a=cc.nextInt();
         System.out.println(" veuillez entrer le nombre b ");
        int b=cc.nextInt();
         System.out.println(" veuillez entrer le nombre c ");
        int c=cc.nextInt();
        
        double d=(b*b)-(4*a*c);
        double x1=(-b-Math.sqrt(d))/(a*2);
        double x2=(-b+Math.sqrt(d))/(a*2);
        if(d>0)
        System.out.println("il y a deux solution x1 : "+x1+" et x2 : "+x2);
        
        if(d==0)
            System.out.println("il y a une seule solution est : "+x1);
        
        if(d<0)
            System.out.println("il n'y a aucun solution");
    }
    
}