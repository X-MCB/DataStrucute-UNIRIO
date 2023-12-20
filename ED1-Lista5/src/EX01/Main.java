package EX01;

public class Main {
    public static void main(String[] args) {
        ListaDuplamente L1 = new ListaDuplamente();
        ListaDuplamente L2 = new ListaDuplamente();

        for(int i = 0; i <= 5; i++){//tamanho arbitrario para exemplo
            L1.insere(i);
        }
        for(int i = 2; i <= 7; i++){//tamanho arbitrario para exemplo
            L2.insere(i);
        }

        L1.imprime();
        L2.imprime();
        L1.instersecao(L1, L2);
    }
}
