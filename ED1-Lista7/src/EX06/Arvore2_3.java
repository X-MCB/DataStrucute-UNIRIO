package EX06;

public class Arvore2_3<Chave extends Comparable<Chave>, Value> {

    private No raiz;

    private class No {
        Chave chave1, chave2;
        Value valor1, valor2;
        No esq, meio, dir;

        No(Chave chave, Value valor) {
            chave1 = chave;
            valor1 = valor;
        }

        boolean Binario() {
            return chave2 == null;
        }

        boolean Ternario() {
            return chave2 != null;
        }
    }

    //Metodo para obter chave
    public Value obter(Chave chave) {
        if (chave == null) throw new IllegalArgumentException("Chave vazia");
        return obter(raiz, chave);
    }

    private Value obter(No x, Chave chave) {
        while (x != null) {
            if (x.Binario()) {
                int cmp = chave.compareTo(x.chave1);
                if (cmp < 0) x = x.esq;
                else if (cmp > 0) x = x.dir;
                else return x.valor1;
            } else {
                int cmp1 = chave.compareTo(x.chave1);
                int cmp2 = chave.compareTo(x.chave2);
                if (cmp1 < 0) x = x.esq;
                else if (cmp2 > 0) x = x.dir;
                else return (cmp2 == 0) ? x.valor2 : x.valor1;
            }
        }
        return null;
    }

    public void inserir(Chave chave, Value valor) {
        if (chave == null) throw new IllegalArgumentException("primeiro argumento para inserir() é nulo");
        if (valor == null) {

            return;
        }

        raiz = inserir(raiz, chave, valor);
    }

    //Metodo para inserir chaves(e respectivos valores) na arvore
    private No inserir(No x, Chave chave, Value valor) {
        if (x == null) return new No(chave, valor);

        if (x.Binario()) {
            if (chave.compareTo(x.chave1) < 0) {
                x.esq = inserir(x.esq, chave, valor);
            } else if (chave.compareTo(x.chave1) > 0) {
                x.dir = inserir(x.dir, chave, valor);
            } else {
                x.valor1 = valor;
            }
        } else {
            int cmp1 = chave.compareTo(x.chave1);
            int cmp2 = chave.compareTo(x.chave2);

            if (cmp1 < 0) {
                x.esq = inserir(x.esq, chave, valor);
            } else if (cmp2 > 0) {
                x.dir = inserir(x.dir, chave, valor);
            } else {
                if (cmp1 == 0) {
                    x.valor1 = valor;
                } else {
                    x.valor2 = valor;
                }
            }
        }

        if (x.Ternario()) {
            tratarNoTernario(x);
        }

        return x;
    }


    /*Metodos para manterem a arvore como 2-3
      Criei 3 métodos para 3 possiveis situacoes

     */
    private void tratarNoTernario(No x) {
        //Chave1 > Chave2
        if (x.chave1.compareTo(x.chave2) > 0) {
            troca(x);
        }

        //Redistribuir as chaves
        if (x.esq != null && x.dir != null && x.esq.Binario() && x.dir.Binario()) {
            redistribui(x);
        }

        //Dividir ternário
        if (x.esq != null && x.dir != null && x.esq.Ternario() && x.dir.Binario()) {
            dividirTernario(x);
        }
    }

    private void troca(No x) {
        Chave tempChave = x.chave1;
        Value tempValor = x.valor1;

        x.chave1 = x.chave2;
        x.valor1 = x.valor2;

        x.chave2 = tempChave;
        x.valor2 = tempValor;
    }

    private void redistribui(No x) {
        No esq = x.esq;
        No dir = x.dir;

        esq.chave2 = x.chave1;
        esq.valor2 = x.valor1;

        x.chave1 = x.chave2;
        x.valor1 = x.valor2;

        x.chave2 = null;
        x.valor2 = null;

        x.esq = esq.meio;
        x.dir = dir.esq;

        dir.esq = dir.meio;
        dir.meio = null;
    }

    private void dividirTernario(No x) {
        No esq = x.esq;
        No dir = x.dir;

        No no = new No(x.chave2, x.valor2);
        no.esq = esq.meio;
        no.meio = null;
        no.dir = dir.esq;

        x.chave2 = x.chave1;
        x.valor2 = x.valor1;

        x.chave1 = esq.chave2;
        x.valor1 = esq.valor2;

        x.dir = x.meio;
        x.meio = null;

        esq.chave2 = null;
        esq.valor2 = null;
        esq.meio = esq.dir;
        esq.dir = no;
    }

}

