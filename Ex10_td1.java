import java.util.*;
public class Ex10_td1 {
    
    public static void main(String[] args) {
        Scanner cc=new Scanner(System.in);
        
        System.out.println(" veuillez entrer le nombre N ");
        int n=cc.nextInt();
        int i,nf=1;
        for( i=1;i<=n;i++)
        { nf=nf*i;}
        System.out.println("N! = "+nf);
    }
}