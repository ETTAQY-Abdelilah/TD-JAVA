import java.util.*;
public class Ex18 {
    
    public static void main(String[] args) {
        
        Scanner cc=new Scanner(System.in);
        System.out.println("entrer un nombre des chiffres de nombre que vous voulez entrer");
        int ch=cc.nextInt();
        int[] N=new int[ch];
        int s=0;
        System.out.println("maintenant entrer les chiffres seccessivement");
        for(int i=0;i<ch;i++)
        {
            N[i]=cc.nextInt();
            s=s+N[i];
        }
        System.out.println("la somme des chiffres qui compose le nombre N est : "+s);
        
    }
    
}