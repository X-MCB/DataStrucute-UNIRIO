package EX06;

public class ListaDuplamente<T> {
    /* Referência para o primeiro elemento */
    protected Elo prim;

    protected class Elo {
        protected T dado;
        protected Elo ant;
        protected Elo prox;

        public Elo() {
            ant = null;
            prox = null;
        }

        public Elo(T elem) {
            dado = elem;
            ant = null;
            prox = null;
        }

        public Elo(T elem, Elo antElem, Elo proxElem) {
            dado = elem;
            ant = antElem;
            prox = proxElem;
        }
    }

    public ListaDuplamente() {
        prim = null;
    }

    /* Testa se a lista está vazia. */
    public boolean vazia() {
        return prim == null;
    }

    /* Insere os elementos e organiza para o mais caro ficar na primeira posicao
    Adaptado para resolver a questao 6. */
    public void insere(T novo) {

        Elo p = new Elo(novo);

        if (prim == null) {
            p.prox = null;
            p.ant = null;
            prim = p;
        } else if (((Chamadas) novo).getCustoMinuto() >= ((Chamadas) prim.dado).getCustoMinuto()) {
            p.prox = prim;
            p.ant = null;
            prim.ant = p;
            prim = p;
        } else {
            Elo q = prim;
            while (q.prox != null && ((Chamadas) novo).getCustoMinuto() <= ((Chamadas) q.prox.dado).getCustoMinuto()) {
                if (((Chamadas) novo).getCustoMinuto() == ((Chamadas) q.prox.dado).getCustoMinuto()) {
                    p.prox = q.prox;
                    p.ant = q;
                    q.prox = p;
                    if (p.prox != null) {
                        p.prox.ant = p;
                    }
                    return;
                }
                q = q.prox;
            }
            p.prox = q.prox;
            p.ant = q;
            q.prox = p;
            if (p.prox != null) {
                p.prox.ant = p;
            }
        }
    }

    /* Método auxiliar para busca. */
    private Elo busca(T elem) {
        Elo p = null;

        for (p = prim; (p != null) && (!p.dado.equals(elem)); p = p.prox);

        return p;
    }

    /* Remove da lista o primeiro elemento com valor igual a "elem". Retorna true se removeu. */
    public boolean remove(T elem) {
        Elo p = busca(elem);

        if (p == null) {
            return false;
        }

        /* Retira primeiro elemento */
        if (p == prim) {
            prim = prim.prox;
        } else {
            /* Retira elemento do meio */
            p.ant.prox = p.prox;
        }

        /* Testa se é o último elemento */
        if (p.prox != null) {
            p.prox.ant = p.ant;
        }

        p = null;

        return true;
    }

    /* Imprime todos os elementos da lista. */
    public void imprime() {
        Elo p;

        System.out.println("Elementos da lista:");

        for (p = prim; p != null; p = p.prox) {
            System.out.println(p.dado + " ");
        }

        System.out.println();
    }

    /* Imprime todos os elementos da lista em ordem reversa. */
    public void imprimeReversa() {
        Elo p;
        Elo ult = null;

        System.out.println("Elementos da lista em ordem reversa:");

        p = prim;

        while (p != null) {
            ult = p;
            p = p.prox;
        }

        for (p = ult; p != null; p = p.ant) {
            System.out.print(p.dado + " ");
        }

        System.out.println();
    }
}
