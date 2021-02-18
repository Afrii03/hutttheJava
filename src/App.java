  import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception { 
    Scanner scanner = new Scanner(System.in);
    System.out.println("podaj nazwe wojewodztwa");
   System.out.println("bez polskich znakow oraz duzych liter");
   System.out.println(woj(scanner.nextLine()));

   scanner.close();
  }

   static String woj( String userwoj){
   String[][] stol = {
   {"slask", "katowice"},
   {"wielkopolska", "poznan"},
   {"malopolska", "krakow"},
   {"mazowieckie", "warszawa"},
   {"ludzkie", "lodz"}
   };

   if(userwoj.equals(stol[0][0])){
    String Kat = stol[0][1];
    return ("Stolica tego województwa to: "+Kat);
}else if(userwoj.equals(stol[1][0])){
     String Poz = stol[1][1];
     return ("Stolica tego województwa to: "+Poz);
}else if(userwoj.equals(stol[2][0])){
     String Kra = stol[2][1];
     return ("Stolica tego województwa to: "+Kra);
}else if(userwoj.equals(stol[3][0])){
     String War = stol[3][1];
     return ("Stolica tego województwa to: "+War);
}else if(userwoj.equals(stol[4][0])){
     String Lod = stol[4][1];
     return ("Stolica tego województwa to: "+Lod);
}else{
  return("zle dane");
   
   

   
 
   
  
  }
   }
  }