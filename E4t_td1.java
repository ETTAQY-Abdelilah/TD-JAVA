import java.util.*;
public class E4t_td1 {
    
    public static void main(String[] args) {
         Scanner cc=new Scanner(System.in);
        int[][] t=new int[3][3];
        int[][] v=new int[3][3];
        int[][] s=new int[3][3];
        int i,j;
        for( i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
        {
            System.out.print("t["+i+"]["+j+"]= " );
         t[i][j]=cc.nextInt();
        }
        }
        
         for( i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
        {
        
        System.out.print(t[i][j]+"  ");
        }
            System.out.println("");
            
            System.out.println("");
        }
        
        
        
        
        
           for( i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
        {
            System.out.print("v["+i+"]["+j+"]= " );
         v[i][j]=cc.nextInt();
        }
        }
        
         for( i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
        {
        
        System.out.print(v[i][j]+"  ");
        }
            System.out.println("");
            
            System.out.println("");
        }
        
        
           for( i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
        {
            s[i][j]=t[i][j]+v[i][j];
        }
        }
        
         for( i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
        {
        
        System.out.print(s[i][j]+"  ");
        }
            System.out.println("");
            
            System.out.println("");
        }
            
    }
    
}