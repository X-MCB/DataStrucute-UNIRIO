package EX05_Binário;

import java.util.Scanner;

import static EX05_Binário.FilaGenerica.geraBinario;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Coloque o numero que deseja representar em binario: ");
        int n = scanner.nextInt();
        geraBinario(n);
    }
}
