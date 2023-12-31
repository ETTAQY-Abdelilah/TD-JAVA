package ex6;


class banque
{
     private int nc ;
     private float solde ;
     private String cin;
     
    public banque(int nc,float solde,String cin){
         
         this.nc=nc;
         this.solde=solde;
         this.cin=cin;
         
    }
     public void deposer(float somme){
          solde=solde-somme;
     }
    public void retier(float somme){
         solde=solde+somme;
         
    }
     public float avoirsolde(){
          return solde;
     }
     
     public String avoirinf(){
          return cin;
     }
     public int getnc(){
          return nc;
     }
     
     public float getsolde(){
          return solde;
     }
     public String getcin(){
          return cin;
     }
}
public class Main {
     
     public static void main(String[] args) {
          banque b=new banque(12,5000,"MA161990");
          System.out.println("banque \n"+b.getnc()+"\n"+b.getsolde()+"\n"+b.getcin());
          System.out.println("solde est : "+b.getsolde()+"\n\n");
          
          b.deposer(500);
          
          
          System.out.println("banque \n"+b.getnc()+"\n"+b.getsolde()+"\n"+b.getcin());
          System.out.println("solde est : "+b.getsolde()+"\n\n");
          
          b.retier(200);
          
          
          System.out.println("banque \n"+b.getnc()+"\n"+b.getsolde()+"\n"+b.getcin());
          System.out.println("solde est : "+b.getsolde());
     }
     
}