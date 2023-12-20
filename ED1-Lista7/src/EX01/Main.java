package EX01;

import EX06.Arvore2_3;

public class Main {
    public static void main(String[] args) {

        ArvBinBusca arv_a = new ArvBinBusca<>();
        ArvBinBusca arv_b = new ArvBinBusca<>();
        ArvBinBusca arv_c = new ArvBinBusca<>();

        RedBlackBST red_a = new RedBlackBST<>();
        RedBlackBST red_b = new RedBlackBST<>();
        RedBlackBST red_c = new RedBlackBST<>();

        int [] vet_a = {70, 19, 11, 89, 13, 17};
        int [] vet_b = {23, 15, 41, 11, 13, 14, 50, 38};
        int [] vet_c = {1, 2, 3, 4, 5, 6, 7};

        arv_a.constroiArvore(vet_a);
        red_a.constroiArvore(vet_a);
        arv_b.constroiArvore(vet_b);
        red_b.constroiArvore(vet_b);
        arv_c.constroiArvore(vet_c);
        red_c.constroiArvore(vet_c);

        System.out.println("Arvores: ");
        System.out.println();
        System.out.println("Arvore Binaria a:");
        arv_a.mostra();
        System.out.println();
        System.out.println("Arvore Rubro Negra a: ");
        red_a.mostra();
        System.out.println();
        System.out.println("Arvore Binaria b: ");
        arv_b.mostra();
        System.out.println();
        System.out.println("Arvore Rubro Negra b: ");
        red_b.mostra();
        System.out.println();
        System.out.println("Arvore Binaria c: ");
        arv_c.mostra();
        System.out.println();
        System.out.println("Arvore Rubro Negra c: ");
        red_c.mostra();

        /*Em ambos os casos as arvores permanecem balanceadas e a complexidade para realizar uma busca
        se mantem O(log n). Entretanto, a arvore rubro negra possui uma eficiencia maior nos métodos de inserir
        e remover, mantendo uma complexidade logaritmica e portanto desemepnhando melhor que as arvores binarias padrao
         */


    }
}
