import java.util.*;
public class Ex8_td8 {
    
    public static void main(String[] args) {
        Scanner cc=new Scanner(System.in);
        System.out.println("saisir le nombre de mois");
        int m=cc.nextInt();
        
        if(m==1||m==3||m==5||m==7||m==8||m==10||m==12
            )
            System.out.println("le nombre fe jours de cet mois est : 31");
        
        else if(m==2)
        {
            int a;
        do{System.out.println("donner l'anner");
         a=cc.nextInt();
    } while(a<1900 || a>2100);
        
        if(a%4==0)
            System.out.println("le nombre de jours de fevrier est 29");    
        else
            System.out.println("le nombre de jours de fevrier est 28");
     
        }
        
        else
           System.out.println("le nombre fe jours de cet mois est : 30");
     
    }
    
}