import java.util.Scanner;
public class Ex3_td1 {
    
    public static void main(String[] args) {
        
                    Scanner cc=new Scanner(System.in);
        
        System.out.println(" veuillez entrer le nombre a ");
        int a=cc.nextInt();
         System.out.println(" veuillez entrer le nombre b ");
        int b=cc.nextInt();
        int s=a+b;
        int p=a*b;
        
        System.out.println("        REMARQUE ");
        
          System.out.println(" Si vous voulez savoir la paire de la somme de a+b veuillez cliquer sur ['1']");
        
          System.out.println(" Si vous voulez savoir la signe de la somme de a+b veuillez cliquer sur ['3']");
        
        
          System.out.println(" Si vous voulez savoir la paire de le produit de a*b veuillez cliquer sur ['2']");
        
           System.out.println(" Si vous voulez savoir la signe de le produit de a*b veuillez cliquer sur ['4']");
        
        System.out.println("veuilez entrer un nombre depent a votre choix ");
        int x=cc.nextInt();
        
        if(x==1)
        {
            if(s%2==0)
                System.out.println(" la somme est paire");
            else                System.out.println(" la somme est impaire");
                
        }
        
        
               if(x==2)
        {
            if(p%2==0)
                System.out.println(" le produit est pair");
            else                System.out.println(" le produit est impair");
                
        }
        
        
               if(x==3)
        {
            if(s>=0)
                System.out.println(" la somme est positive");
            else                System.out.println(" la somme est negative");
                
        }
        
               if(x==4)
        {
            if(p>=0)
                System.out.println(" le produit est positive");
            else                System.out.println(" le produit est negative");
                
        }
    }
    
}