package EX03;

import javax.net.ssl.ExtendedSSLSession;

public class Main {
    public static void main(String[] args) {
        ListaOrdenada<String> lista = new ListaOrdenada<>();
        lista.insere("Matheus");
        lista.insere("Andressa");
        lista.insere("Daniel");
        lista.insere("Mauricio");
        lista.insere("Laura");
        lista.insere("Ronaldo");
        lista.insere("Pedro");
        lista.insere("Diogo");

        lista.ordenaAlfabetica();
        lista.imprime();
        /*Complexidade = O(nˆ2). O método ordena compara e troca os elementos da lista com os seus adjacentes.
        Esse processo se repete até que toda a lista esteja ordenada. Durante o loop mais externo o método irá verificar
        se ocorreu alguma troca(entre os elementos) na interacao anterior. No pior caso (todos os nomes da lista estão
        fora de ordem alfabetica com relacao as adjacentes), o método irá realizar n - 1 interacoes(n = quantidade de
        elementos) e durante essas n - 1 interacoes irá realizar n - 1 comparacoes. Logo, sua complexidade é quadrática
        em relacao a quantidade de nomes presentes na lista, por isso O(nˆ2). */
    }
}
