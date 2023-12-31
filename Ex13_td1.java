import java.util.*;
public class Ex13_td1 {
    
    public static void main(String[] args) {
             Scanner cc=new Scanner(System.in);
        
        System.out.println(" veuillez entrer le nombre a ");
        int a=cc.nextInt();
         System.out.println(" veuillez entrer le nombre b ");
        int b=cc.nextInt();
        int pgcd1=0,pgcd2=0,k,i,r;
        
        if(a>=b)
        for(i=2;i<=b;i++)
        {
            if(a%i==0 && b%i==0)
                pgcd1=i;
            else
                k=0;
        }
        
        else
        for(i=2;i<=a;i++)
        {
            if(a%i==0 && b%i==0)
                pgcd1=i;
            else
                k=0;
        }
        
        
        r=a%b;
        if(b>=r)
        for(i=2;i<=r;i++)
        {
            if(r%i==0 && b%i==0)
                pgcd2=i;
            else
                k=0;
        }
        else
            r=b%a;
        for(i=2;i<=b;i++)
        {
            if(r%i==0 && b%i==0)
                pgcd2=i;
            else
                k=0;
        }
        
        if(pgcd1==pgcd2)
        System.out.println("PGCD("+a+","+b+") est : "+pgcd1);
        else if(pgcd1==0)
            System.out.println("il n'a pas de PGCD");
        
     else
            System.out.println("il n'a pas de PGCD");
    }
}