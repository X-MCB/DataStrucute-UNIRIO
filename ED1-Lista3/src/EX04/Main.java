package EX04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PilhaGenerica<Integer> pilhaGenerica = new PilhaGenerica<>(5);//Tamanho Default como exemplo
        int contador = 0;

        do{
            System.out.println("Coloque um inteiro: ");
            int inteiro = scanner.nextInt();
            pilhaGenerica.push(inteiro);
            if(inteiro % 2 == 0)
                contador++;
        }while(!pilhaGenerica.cheia());

        System.out.println("Inteiros Pares: " + contador);

    }
}
