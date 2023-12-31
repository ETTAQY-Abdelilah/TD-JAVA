package td1;
import java.util.Scanner;
public class Ex5_td1 {
    
    public static void main(String[] args) {
        Scanner cc=new Scanner(System.in);
        int h;
                char c;
        System.out.println("choiser votre langue");
            c=cc.next().charAt(1);
w
        
        
        
        if(c=='fr')
        {
            do{System.out.println("donner l'heure actuelle");
            h=cc.nextInt();
        }while(h<0 || h>=24);
        
        if(h<=22 && h>18)
            System.out.println("BONSOIR");
            
        else if(h>=0 && h<=18)
            System.out.println("BONJOUR");
        
            else
            System.out.println("BONNE NUIT");
        }
        
        
        
        else if(c=='an')
        {
            do{System.out.println("give me the hour");
            h=cc.nextInt();
        }while(h<0 || h>=24);
            
        if(h<=22 && h>18)
            System.out.println("good evening");
            
        else if(h>=0 && h<=18)
            System.out.println("good morning");
        
            else
            System.out.println("good night");
        }
    }
    
}