package ex5;

class rectangle
{
    public double longueur,largeur;
     public rectangle(){
          
     }
     public rectangle(double longueur,double largeur){
          longueur=7.5;
     				   largeur=5.6;
     }
     public rectangle(rectangle r){
          longueur=4;
          largeur=3;
     }
     
     public double getlongueur(){
          return longueur;
     }
     public double getlargeur(){
          return largeur;
     }
     public void setrectangle(double longueur,double largeur){
          this.longueur=longueur;
          this.largeur=largeur;
     }
}
public class Main {
     
     public static void main(String[] args) {
          rectangle rec=new rectangle(5,8);
          
         rec.setrectangle(5.5,7);
          System.out.println("reeeeeeec\n"+rec.longueur);
     }
     
}