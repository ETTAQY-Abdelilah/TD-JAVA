package ex2 class Point{
     String nom;
     double x,y;
     
     Point(){
          x=5;
          y=3;
          nom="A";
          
     }
     
      String getNom(){
          return nom ;
     }
     
      double getx(){
          return x;
          
     }
     double gety(){
          return y;
         
     }
     void setabss(double x,double y){
          this.x=x;
          this.y=y;
     }
     
      void setnom(String nom){
          this.nom=nom;
     }
     
    double norme(){
          return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
     }
}

public class Main {
     
     public static void main(String[] args) {
          Point p=new Point();
          p.setabss(6,8);
          System.out.println("nom est "+p.nom+",x= "+p.x+",y= "+p.y);
          System.out.println("D : "+p.norme());
     }
     
}