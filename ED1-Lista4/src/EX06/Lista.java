package EX06;

public class Lista<T extends Comparable<T>> {

    protected Elo<T> prim;

    protected static class Elo<T extends Comparable<T>> implements Comparable<Elo<T>> {
        protected T dado;

        protected Elo<T> prox;
        protected Elo<T> pasta;
        protected Elo<T> subPasta;
        protected Elo<T> primSub;

        public Elo() {

            prox = null;
        }

        public Elo(T elem) {
            dado = elem;
            prox = null;
            subPasta = null;
            pasta = null;
            primSub = null;
        }

        public Elo(T elem, Elo<T> pasta) {
            dado = elem;
            prox = null;
            subPasta = null;
            this.pasta = pasta;
            primSub = null;
        }

        public int compareTo(Elo<T> elo) {

            return elo.dado.compareTo(dado);
        }
    }

    public Lista() {

        prim = null;
    }

    /* Testa se a lista est� vazia. */
    public boolean vazia() {

        return prim == null;
    }

    /* Insere elemento no in�cio da lista. */
    public void inserePasta(T novo) {
        Elo<T> p = new Elo<>(novo);
        p.prox = prim;
        prim = p;
    }

    public void insere(T novo, T nomePasta) {
        Elo<T> q = buscaRecursiva(nomePasta);
        if (q != null) {
            Elo<T> p = new Elo<>(novo, q);
            p.pasta.subPasta = p;
            p.prox = p.pasta.primSub;
            p.pasta.primSub = p;
        } else
            System.out.println("Pasta nao existe");
    }

    public boolean remove(T elem) {
        Elo<T> p = buscaRecursiva(elem);


        /* Se p � null, ent�o n�o encontrou elemento. */
        if (p == null)
            return false;

        Elo<T> ant = buscaRecursivaAnt(elem);

        if (p == prim)
            prim = prim.prox; /* Remove elemento do in�cio. */
        else if (p.pasta != null && p == p.pasta.primSub)
            p.pasta.primSub = p.pasta.primSub.prox;
        else
            ant.prox = p.prox;  /* Remove elemento do meio. */


        /* Remove a �ltima refer�ncia para o elo a ser removido. Dessa forma,
         * o Garbage Collector ir� liberar essa mem�ria. */
        p = null;

        return true;
    }

    public Elo<T> buscaRecursiva(T elem) {
        if (this.vazia())
            return null;
        boolean falso = false;
        return buscaRecursiva(elem, prim, falso);
    }

    /* Verifica se um determinado elemento est� na lista. */
    private Elo<T> buscaRecursivaAnt(T elem, Elo<T> p, boolean falso, Elo<T> ant) {
        if (p == null)
            return null;
        if (p.dado.equals(elem))
            return ant;
        ant = p;
        if (p.subPasta != null && !falso)
            p = p.subPasta;
        else if (p.prox == null && p.pasta != null && p.pasta.prox != null) {
            p = p.pasta.prox;
            falso = false;
        } else if (p.prox == null && p.pasta != null) {
            p = p.pasta;
            falso = true;
        } else if (p.prox != null)
            p = p.prox;
        else
            p = null;
        return buscaRecursivaAnt(elem, p, falso, ant);
    }

    public Elo<T> buscaRecursivaAnt(T elem) {
        if (this.vazia())
            return null;
        boolean falso = false;
        Elo<T> ant = null;
        return buscaRecursivaAnt(elem, prim, falso, ant);
    }

    /* Verifica se um determinado elemento est� na lista. */
    private Elo<T> buscaRecursiva(T elem, Elo<T> p, boolean falso) {
        if (p == null)
            return null;
        if (p.dado.equals(elem))
            return p;
        if (p.subPasta != null && !falso)
            p = p.subPasta;
        else if (p.prox == null && p.pasta != null && p.pasta.prox != null) {
            p = p.pasta.prox;
            falso = false;
        } else if (p.prox == null && p.pasta != null) {
            p = p.pasta;
            falso = true;
        } else if (p.prox != null)
            p = p.prox;
        else
            p = null;
        return buscaRecursiva(elem, p, falso);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Elementos da lista:\n");

        if (this.vazia())
            return sb.toString();

        int espaco = 0;
        boolean falso = false;

        sb.append(imprime(prim, espaco, falso));
        sb.append("\n");

        return sb.toString();
    }

    private String imprime(Elo<T> p, int espaco, boolean falso) {
        StringBuilder sb = new StringBuilder();

        if (p == null)
            return sb.toString();

        if (!falso) {
            for (int i = 0; i < espaco; i++) {
                sb.append("  ");
            }
        }
        if (!falso && p.subPasta == null)
            sb.append(p.dado).append("\n");
        else if (!falso && p.subPasta != null)
            sb.append(p.dado).append(" ");
        if (p.subPasta != null && !falso) {
            espaco++;
            sb.append("\n");
            p = p.subPasta;
        } else if (p.prox == null && p.pasta != null && p.pasta.prox != null) {
            espaco--;
            p = p.pasta.prox;
            falso = false;
        } else if (p.prox == null && p.pasta != null) {
            espaco--;
            p = p.pasta;
            falso = true;
        } else if (p.prox != null) {
            p = p.prox;
            falso = false;
        } else
            p = null;

        sb.append(imprime(p, espaco, falso));
        return sb.toString();
    }

}