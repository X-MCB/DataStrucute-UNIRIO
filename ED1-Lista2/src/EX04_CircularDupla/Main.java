package EX04_CircularDupla;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Coloque o tamanho da fila: ");
        int tam = scanner.nextInt();
        Fila  fila = new Fila(tam);
        for(int i = 0; i < tam; i++){
            System.out.print("Coloque elemento para inserir na fila: ");
            int elemento = scanner.nextInt();
            fila.insere(elemento);
        }

        System.out.println(fila.retornafilaDupla(fila));


    }

}
