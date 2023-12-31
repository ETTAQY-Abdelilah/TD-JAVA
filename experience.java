package exemple;

public class experience {
     
     public static void main(String[] args) {
          int[] t={6,9,20,3,8,83,3,78,8};
          int m=t[0],n=t[0],o=t[0],j=0,b=0,c=0;
          for(int i=0;i<t.length;i++)
          {
               if(m<=t[i])
               {
                    m=t[i];
                    b=i;
               }
               else
               {
                    j=m;
               }
          }
          System.out.println("le max1 est : "+m);
          
            for(int i=0;i<t.length;i++)
          {
              
               if(n<=t[i])
               {
                    if(i!=b )
                    { n=t[i];
                    c=i;}
                    else
                         continue;
               }
               else
               {
                    j=m;
               }
              
          }
          System.out.println("le max2 est : "+n);
          
            for(int i=0;i<t.length;i++)
          {
              
                   
               if(o<=t[i])
               {
                    if(i!=c&&i!=b)
                         
                    {  o=t[i];}
                    else
                         continue;
                    
               }
               else
               {
                    j=m;
               }}
          System.out.println("le max3 est : "+o);
    
    
     }
     
}