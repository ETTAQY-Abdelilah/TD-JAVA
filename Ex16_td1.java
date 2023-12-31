import java.util.*;
public class Ex16_td1 {
    
    public static void main(String[] args) {
        Scanner cc=new Scanner(System.in);
        System.out.println("veuillez entrer de lignes");
        int n=cc.nextInt();
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println("");
        }
        
        
        for(int i=n-1;i>=0;i--)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
    
}