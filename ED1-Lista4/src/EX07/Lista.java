package EX07;

public class Lista extends EX07.Inimigo {
    /* Referência para o primeiro elemento */
    protected Elo prim;

    protected class Elo {
        protected Inimigo dado;
        protected Elo prox;

        public Elo() {
            prox = null;
        }

        public Elo(Inimigo elem) {
            dado = elem;
            prox = null;
        }

        public Elo(Inimigo elem, Elo proxElem) {
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

    /* Insere elemento no início da lista. */
    public void insere(Inimigo inimigo) {
        Elo p = new Elo(inimigo);
        p.prox = prim;
        prim = p;
    }


    public boolean localizar(Inimigo inimigo) {
        Elo p;
        boolean localizado = false;

        for (p = prim; p != null; p = p.prox) {
            if (p.dado.equals(inimigo)) {
                System.out.println("Inimigo " + inimigo.getNome() + " localizado");
                localizado = true;
            }
        }
        return localizado;
    }

    /* Implementação recursiva do método de busca. */
    public boolean buscaRecursiva(Inimigo elem) {
        if (this.vazia())
            return false;

        return buscaRecursiva(elem, prim);
    }

    private boolean buscaRecursiva(Inimigo elem, Elo p) {
        if (p == null)
            return false;

        if (p.dado.equals(elem))
            return true;

        return buscaRecursiva(elem, p.prox);
    }

    /* Remove da lista o primeiro elemento com valor igual a "elem". Retorna true se removeu. */
    public boolean efetuarDano(Inimigo inimigo, double dano) {
        Elo p;
        Elo ant = null; /* Referência para anterior. */

        for (p = prim; ((p != null) && (!p.dado.equals(inimigo))); p = p.prox)
            ant = p;

        /* Se p é null, então não encontrou elemento. */
        if (p == null)
            return false;
        if(inimigo.getVida() - dano <= 0) {
            if (p == prim)
                prim = prim.prox; /* Remove elemento do início. */
            else
                ant.prox = p.prox; /* Remove elemento do meio. */

            /* Remove a última referência para o elo a ser removido. Dessa forma,
             * o Garbage Collector irá liberar essa memória. */
            p = null;
            System.out.println("Inimigo " + inimigo.getNome() + ":\nTeve a vida reduziada a 0!");
            System.out.println();
            return true;
        }
        else{
            System.out.println("Inimigo " + inimigo.getNome() + ":\n" + "Dano sofrido: " + dano + "\nVida restante: " + inimigo.getVida());
            System.out.println();
            return false;
        }
    }

    /* Imprime todos os elementos da lista. */
    public void imprime() {
        Elo p;

        System.out.println("Inimigos:");

        for (p = prim; p != null; p = p.prox) {
            Inimigo inimigo = (Inimigo) p.dado;
            System.out.println(inimigo.getNome());
        }

    }

    /* Implementação recursiva da função de impressão. */
    public void imprimeRecursivo() {
        System.out.println("Elementos da lista:");

        if (this.vazia())
            return;

        imprimeRecursivo(prim);

        System.out.println();
    }

    private void imprimeRecursivo(Elo p) {
        if (p == null)
            return;

        System.out.print(p.dado + " ");

        imprimeRecursivo(p.prox);
    }

    /* Calcula e retorna o tamanho da lista. */
    public int tamanho() {
        int tam = 0;
        Elo p = prim;

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

    private int tamanhoRecursivo(Elo p) {
        if (p == null)
            return 0;

        return 1 + tamanhoRecursivo(p.prox);
    }

}

