import java.util.*;
public class Ex14_td1 {
    
    public static void main(String[] args) {
        int i,j,m=0,k;
           System.out.println("voila toute les possibilites");
        for(i=1;i<=9;i++)
        {
            for(j=1;j<=9;j++)
            {
                for(k=1;k<=9;k++)
                {
                    if((i+j+k)==15 && i!=j && i!=k && j!=k)
                        
                    { System.out.println("("+i+","+j+","+k+")")  ;    
                    m++;}
                }
            }
        }
        System.out.println("nombre d'iteration est : "+m);
     
    }
    
}