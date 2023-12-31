package livre;

class livre
{
     private int id;
     private String titre;
     private String auteur;
     private double prix;
     public static int c;
     public int getid(){
          return id;
     }
     
     public double getprix(){
          return prix;
     }
     
     public String gettitre()
     {
          return titre;
     }
     
     

     public String getauteur()
     {
          return auteur;
     }
     
     public void setid(int id){
          this.id=id;
     }
     public void settitre(String titre){
          this.titre=titre;
     }
     public void setauteur(String a){
          this.auteur=a;
     }
     public void setprix(double prix){
          this.prix=prix;
     }
     
     public livre()
     {
          this.id=++c;
          this.titre="titre";
          this.auteur="auteur";
          this.prix=66.7;
     }
     
     public String toString()
     {
          return "le livre "+this.titre+" de id "+this.id+" ecrie par "+this.auteur+" de prix : "+this.prix;
     }
}
public class Main {
     
     public static void main(String[] args) {
          livre l=new livre();
          
        System.out.println(l.toString());
     }
     
}