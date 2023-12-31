package kk;

enum genre {fils,fille};

class gg{
     public String nom;
     public genre g;
}

public class Main {
     
     public static void main(String[] args) {
          
          gg cc=new gg();
          cc.g=genre.fils;
          System.out.println(cc.g);
     }
     
}