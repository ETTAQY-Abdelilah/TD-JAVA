import java.util.*;
public class Ex7_td1 {
    
    public static void main(String[] args) {
               Scanner cc=new Scanner(System.in);
        
        System.out.println(" veuillez entrer les chiffres de nombre N");
        int a=cc.nextInt();
         
        int b=cc.nextInt();
         
        int c=cc.nextInt();
        
        System.out.println("les nombres formes par les chiffres de N sont : ");
        System.out.println(a+""+b+""+c+", "+a+""+c+""+b+", "+b+""+a+""+c+", "+b+""+c+""+a+", "+c+""+a+""+b+", "+c+""+b+""+a+".");
    }
    
}