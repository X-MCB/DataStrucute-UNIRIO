package EX04;

public class Main {
    public static void main(String[] args) {
        ListaDuplamente lista = new ListaDuplamente();
        for(int i = 0; i < 5; i++){
            lista.insere(i);
        }
        lista.imprime();
        lista.trocaElos(2, 3);
        lista.imprime();
    }
}
