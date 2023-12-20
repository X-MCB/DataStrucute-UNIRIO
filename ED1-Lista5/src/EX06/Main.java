package EX06;

public class Main {
    public static void main(String[] args) {
        ListaDuplamente<Chamadas> listaChamadas = new ListaDuplamente<>();

        Chamadas chamada1 = new Chamadas("021983236765", 21.22);
        Chamadas chamada2 = new Chamadas("011934125289", 38.98);
        Chamadas chamada3 = new Chamadas("030991237877", 41.28);
        Chamadas chamada4 = new Chamadas("032342312123", 35.23);
        Chamadas chamada5 = new Chamadas("049928394839", 19.23);
        Chamadas chamada6 = new Chamadas("093948493844", 19.23);

            listaChamadas.insere(chamada1);
            listaChamadas.insere(chamada2);
            listaChamadas.insere(chamada3);
            listaChamadas.insere(chamada4);
            listaChamadas.insere(chamada5);
            listaChamadas.insere(chamada6);

            listaChamadas.imprime();
            /* Complexidade O(1) pois a comparacao é feita
            durante o método inserir, ou seja, durante a criacao da lista, portanto
            sao feitas somente atribuicoes e comparacoes com o ultimo elemento inserido.
             */

    }
}
