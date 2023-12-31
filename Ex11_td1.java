import java.util.*;
public class Ex11_td1 {
    
    public static void main(String[] args) {
          Scanner cc=new Scanner(System.in);
        
        System.out.println(" veuillez entrer le nombre N ");
        int n=cc.nextInt();
        int i,s=0;
        for(i=1;i<=n;i++)
        {
            if(i%2!=0)
                s=s+i;
        }
        System.out.println("la somme des impairs qu'inferieur a "+n+" est : "+s);
    }
    
}