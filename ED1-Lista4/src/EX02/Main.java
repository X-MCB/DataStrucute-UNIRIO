package EX02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaOrdenada lista1 = new ListaOrdenada();
        ListaOrdenada lista2 = new ListaOrdenada();
        int elemento;

        for(int i = 0; i < 5; i++) { //Complexidade O(n), determinada pela quantidade de interacoes demarcadas no for
            System.out.println("Coloque um elemento para adicionar a lista 1: ");
            elemento = scanner.nextInt();
            lista1.insere(elemento);
        }

        for(int i = 0; i < 5; i++) {//Complexidade O(n), determinada pela quantidade de interacoes demarcadas no for
            System.out.println("Coloque um elemento para adicionar a lista 2: ");
            elemento = scanner.nextInt();
            lista2.insere(elemento);
        }

        ListaOrdenada.ordena(lista1,lista2);
        scanner.close();
        /* Complexidade de ordena é O(n). Ao utilizar um único for para percorrer o ambas as listas ao mesmo tempo
       o número de interacoes será determinado pelo tamanho da lista1(n1) + o tamanho da lista2(n2). Em cada uma dessas
       interacoes serão feitas apenas duas atribuicoes.Portanto, o fato determinante será apenas a soma das quantidades
       de elementos (n) presentes em cada uma das listas. Logo, complexidade = O(n1 + n2), ou O(n).*/
    }
}
