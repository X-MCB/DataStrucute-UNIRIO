package EX03;

public class Main {
    public static void main(String[] args) {
        ListaCircular L1 = new ListaCircular();

        for(int i = 1; i <= 5; i++){//tamanho arbitrario para exemplo
            L1.insere(i);
        }
        L1.imprime();
        L1.inverteLista();
    }
}
