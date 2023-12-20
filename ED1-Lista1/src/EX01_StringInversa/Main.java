package EX01_StringInversa;

import java.util.Scanner;
import static EX01_StringInversa.StringABBA.verificaABBA;

public class Main {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         System.out.println("Coloque a string: ");
         String str = scanner.nextLine();

         if(verificaABBA(str))
             System.out.print("É palindromo!");
         else
             System.out.println("Não é palindromo!");

         scanner.close();
    }
}
