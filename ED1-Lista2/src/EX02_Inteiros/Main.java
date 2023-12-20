package EX02_Inteiros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tam1, tam2;
        int elementos1, elementos2;

        System.out.println("Coloque o tamanho da fila 1: ");
        tam1 = scanner.nextInt();
        System.out.println("Coloque o tamanho da fila 2: ");
        tam2 = scanner.nextInt();
        FilaGenerica<Integer> f1 = new FilaGenerica<>(tam1);
        FilaGenerica<Integer> f2 = new FilaGenerica<>(tam2);

        for(int i = 0; i < tam1; i++){
            System.out.println("Coloque um numero que deseja adicionar na fila1: ");
            elementos1 = scanner.nextInt();
            f1.insere(elementos1);
        }
        for(int j = 0; j < tam2; j++){
            System.out.println("Coloque um numero que deseja adicionar na fila2: ");
            elementos2 = scanner.nextInt();
            f2.insere(elementos2);
        }
        System.out.print("Fila Mista: ");
        f1.combinaFilas(f1, f2);

    }
}
