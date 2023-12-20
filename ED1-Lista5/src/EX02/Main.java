package EX02;

public class Main {
    public static void main(String[] args) {
        ListaCircular L1 = new ListaCircular();
        ListaCircular L2 = new ListaCircular();

        for(int i = 1; i <= 5; i++){//tamanho arbitrario para exemplo
            L1.insere(i);
        }
        for(int i = 6; i <= 10; i++){//tamanho arbitrario para exemplo
            L2.insere(i);
        }

        L1.imprime();
        L2.imprime();

        L1.merge(L2);

    }
}
