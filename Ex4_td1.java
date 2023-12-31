import java.util.*;
public class Ex4_td1 {
    
    public static void main(String[] args) {
        Scanner cc=new Scanner(System.in);
        
        int n;
        do{System.out.println("saisir votre note ");
         n=cc.nextInt();}
    while(n<0 || n>20);
        
            if(n>=16)
                System.out.println("tres bien");
        
        else if(n>=14)
                System.out.println("bien");
        
            else if(n>=12)
                System.out.println("assez bien");
        
                else
                System.out.println("passable");
    }
    
}