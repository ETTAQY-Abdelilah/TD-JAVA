import java.util.*;
public class Ex2t_td1 {
    
    public static void main(String[] args) {
        Scanner cc=new Scanner(System.in);
        
        System.out.println("entrer un nombre");
        int n=cc.nextInt();
        int[] t=new int[35];
        int k=0,i=0,q;
        do{
            t[i]=n%2;
            q=n/2;
            n=q;
            i++;
            k=i;
        }while(q==0);
        
        for(int j=k;j>=0;j--)
        System.out.print(t[j]);
    }
    
}