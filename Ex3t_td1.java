import java.util.*;
public class Ex3t_td1 {
    
    public static void main(String[] args) {
        Scanner cc=new Scanner(System.in);
        int[] t=new int[6];
        int i,sup,s=0;
        float moy;
        for( i=0;i<6;i++)
        {System.out.println("note "+i+" est ");
         t[i]=cc.nextInt();
           
        }
        sup=t[0];
        for(i=0;i<6;i++)
        {
             s=s+t[i];
            if(sup<=t[i])
                sup=t[i];
            else
                moy=i;
        }
        moy=s/6;
        System.out.println("voila le moyenne : "+moy);
        
        System.out.println("voila la note superier : "+sup);
    }
}
