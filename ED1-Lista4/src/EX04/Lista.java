package EX04;

public class Lista<T> {
    /* Referência para o primeiro elemento */
    protected Elo<T> prim;

    protected class Elo<E> {
        protected E dado;
        protected Elo<E> prox;

        public Elo() {
            prox = null;
        }

        public Elo(E elem) {
            dado = elem;
            prox = null;
        }

        public Elo(E elem, Elo<E> proxElem) {
            dado = elem;
            prox = proxElem;
        }
    }

    public Lista() {
        prim = null;
    }

    /* Testa se a lista está vazia. */
    public boolean vazia() {
        return prim == null;
    }

    /* ADAPTADO PARA O EXERCÍCIO 4. Insere elemento no FINAL da lista. */
    public void insere(T novo) {
        Elo<T> p = new Elo<>(novo);
        if (prim == null) {
            prim = p;
        } else {
            Elo<T> atual = prim;
            while (atual.prox != null) {
                atual = atual.prox;
            }
            atual.prox = p;
        }
    }

    /* Verifica se um determinado elemento está na lista. */
    public boolean busca(T elem) {
        Elo<T> p;

        for (p = prim; p != null; p = p.prox) {
            if (p.dado.equals(elem))
                return true;
        }

        return false;
    }

    /* Implementação recursiva do método de busca. */
    public boolean buscaRecursiva(T elem) {
        if (this.vazia())
            return false;

        return buscaRecursiva(elem, prim);
    }

    private boolean buscaRecursiva(T elem, Elo<T> p) {
        if (p == null)
            return false;

        if (p.dado.equals(elem))
            return true;

        return buscaRecursiva(elem, p.prox);
    }

    /* Remove da lista o primeiro elemento com valor igual a "elem". Retorna true se removeu. */
    public boolean remove(T elem) {
        Elo<T> p;
        Elo<T> ant = null; /* Referência para anterior. */

        for (p = prim; ((p != null) && (!p.dado.equals(elem))); p = p.prox)
            ant = p;

        /* Se p é null, então não encontrou elemento. */
        if (p == null)
            return false;

        if (p == prim)
            prim = prim.prox; /* Remove elemento do início. */
        else
            ant.prox = p.prox; /* Remove elemento do meio. */

        /* Remove a última referência para o elo a ser removido. Dessa forma,
         * o Garbage Collector irá liberar essa memória. */
        p = null;

        return true;
    }

    /* Imprime todos os elementos da lista. */
    public void imprime() {
        Elo<T> p;

        System.out.println("Elementos da lista:");

        for (p = prim; p != null; p = p.prox) {
            System.out.print(p.dado + " ");
        }

        System.out.println();
    }

    /* Implementação recursiva da função de impressão. */
    public void imprimeRecursivo() {
        System.out.println("Elementos da lista:");

        if (this.vazia())
            return;

        imprimeRecursivo(prim);

        System.out.println();
    }

    private void imprimeRecursivo(Elo<T> p) {
        if (p == null)
            return;

        System.out.print(p.dado + " ");

        imprimeRecursivo(p.prox);
    }

    /* Calcula e retorna o tamanho da lista. */
    public int tamanho() {
        int tam = 0;
        Elo<T> p = prim;

        while (p != null) {
            tam++;
            p = p.prox;
        }

        return tam;
    }

    /* Calcula e retorna o tamanho da lista de maneira recursiva. */
    public int tamanhoRecursivo() {
        if (this.vazia())
            return 0;

        return tamanhoRecursivo(prim);
    }

    private int tamanhoRecursivo(Elo<T> p) {
        if (p == null)
            return 0;

        return 1 + tamanhoRecursivo(p.prox);
    }

    public String retornaFrase(Lista<String> listaTokens) {
        Elo<String> atual = (Elo<String>) listaTokens.prim;
        StringBuilder frase = new StringBuilder();

        while (atual != null) {
            frase.append(atual.dado);
            frase.append(" ");
            atual = atual.prox;
        }

        return frase.toString().trim();
    }

    }


