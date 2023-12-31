import java.util.*;
public class Ex5t_td1 {
    
    public static void main(String[] args) {
        
        Scanner cc=new Scanner(System.in);
        
        
        System.out.println("entrer le nombre de lettres");
        int n=cc.nextInt();
        int i,j;
        char[] t=new char[n];
        System.out.println("veuillez entrer le mot");
        for(i=0;i<n;i++)
        {
            t[i]=cc.next().charAt(0);
        }
        for(i=0;i<n;i++) 
        {
            System.out.print(t[i]);
        }
        
            System.out.println("");
        for(i=n-1;i>=0;i--)
        {
            System.out.print(t[i]);
        }
    }
    
}