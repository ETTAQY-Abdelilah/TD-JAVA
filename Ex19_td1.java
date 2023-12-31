import java.util.*;
public class Ex19_td1 {
    
    public static void main(String[] args) {
        
        Scanner cc=new Scanner(System.in);
        System.out.println("entrer un nombre");
        int n=cc.nextInt();
        int m=8;
        String nn=Integer.toString(n,m);
        
        System.out.println("String : "+nn);
    }
    
}