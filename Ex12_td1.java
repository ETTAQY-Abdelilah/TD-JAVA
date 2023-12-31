import java.util.*;
public class Ex12_td1 {
    
    public static void main(String[] args) {
        Scanner cc=new 	Scanner(System.in);
        int i=1,n,m,k=0;
        int[] t=new int[20];
        do{System.out.print("t["+i+"]= ");
            t[i]=cc.nextInt();
            i++;
        }
            while(t[i]!=0);
        
        m=t[1];
        for(i=1;i<=6;i++)
        {
            if(m<t[i])
            {m=t[i];
            k=i;}
            else
                n=m;
        }
        System.out.println("le max est : "+m+" avec un index egale a : "+k);
    }
    
}