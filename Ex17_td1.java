import java.util.*;
public class Ex17_td1 {
    
    public static void main(String[] args) {
        Scanner cc=new Scanner(System.in);
        System.out.println("veuillez entrer de lignes");
        int n=cc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}