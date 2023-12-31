package ex3;
import java.util.List;

class livre {
     public String titre="abdo";
     public String auteur ;
     public double prix;
     public int annee;
     
     public livre()
     {
          
     }
    
       public livre(String titre)
     {
          titre="fatatni salat";
     }
     
       public livre(String titre, String auteur)
     {
          this(titre);
          auteur="Mohammed abdessalam";
     }
     
     
       public livre(String titre,String auteur ,double prix)
     {
          this(titre,auteur);
          prix=30.99;
          
     }
     
       public livre(String titre, String auteur, double prix,int annee)
     {
          this(titre,auteur,prix);
          annee=2001;
     }
     
       public livre(livre l)
     {
          l.prix=66;
          l.titre="kalila w dimna";
          l.auteur="omar elmokhtar";
          l.annee=1977;
     }
}
public class Main {
     
     public static void main(String[] args) {
          livre ll;
          ll=new livre();
          Arraylist<Integer> g=new ArrayList<>();
          System.out.println("livre\n"+ll.titre+"\n"+ll.auteur+"\n"+ll.prix+"\n"+ll.annee);
     }
     
}