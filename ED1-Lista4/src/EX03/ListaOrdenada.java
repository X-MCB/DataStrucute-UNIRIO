package EX03;

public class ListaOrdenada<T extends Comparable<T>> extends Lista<T> {
    protected Elo<T> prim;


    public int compareTo(T o) {
        return 0;
    }

    protected static class Elo<T> {
        protected T dado;
        protected Elo<T> prox;

        public Elo(T elem) {
            dado = elem;
            prox = null;
        }
    }

    public ListaOrdenada() {
        prim = null;
    }

    public boolean vazia() {
        return prim == null;
    }


    public void insere(T novo) {
        Elo<T> p = new Elo<>(novo);
        Elo<T> ant = null, atual = prim;

        while (atual != null && atual.dado.compareTo(novo) < 0) {
            ant = atual;
            atual = atual.prox;
        }

        if (ant == null) {
            p.prox = prim;
            prim = p;
        } else {
            ant.prox = p;
            p.prox = atual;
        }
    }

    public void imprime() {
        Elo<T> p;

        System.out.println("Elementos em ordem alfabética:");

        for (p = prim; p != null; p = p.prox) {
            System.out.println(p.dado + " ");
        }

        System.out.println();
    }

    public void ordenaAlfabetica() {
        boolean trocou;
        Elo<T> p;
        do {
            trocou = false;
            p = prim;

            while (p != null && p.prox != null) {
                if (p.dado.compareTo(p.prox.dado) > 0) {
                    T temp = p.dado;
                    p.dado = p.prox.dado;
                    p.prox.dado = temp;
                    trocou = true;
                }
                p = p.prox;
            }
        } while (trocou);
    }


}
