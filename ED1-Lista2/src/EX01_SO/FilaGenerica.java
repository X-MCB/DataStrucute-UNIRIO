package EX01_SO;

import java.util.Vector;

public class FilaGenerica<T>
{
    /* Atributos protected para serem usados na subclasse. */
    protected int tamanho;	/* Tamanho do vetor */
    protected Vector<T> vetor;	/* Vetor de elementos */
    protected int ini;	/* Posicao do proximo elemento a ser retirado */
    protected int n;	/* Numero de elementos na fila */

    public FilaGenerica(int tamanho)
    {
        this.tamanho = tamanho;
        this.vetor = new Vector<T>(tamanho);
        this.ini = 0;
        this.n = 0;
    }

    public boolean vazia()
    {
        return (n == 0);
    }

    public boolean cheia()
    {
        return (n == tamanho);
    }

    //Retiramos o elemento do inÌcio da fila
    public T remove()
    {
        T elemento = null;

        if (!this.vazia())
        {
            elemento = this.vetor.get(ini);
            ini = (ini + 1) % tamanho;
            n--;
        }

        return elemento;
    }

    //Inserimos o elemento no final da fila
    public boolean insere(T elemento)
    {
        int fim;

        if ( !cheia() ) {
            fim = (ini + n) % tamanho;
            this.vetor.add(fim, elemento);
            n++;
            return true;
        }
        else
            return false;
    }

    //metodo exercicio 1 remover o fim da fila
    public T removeFim()
    {
        T elemento = null;
        int fim;
        if (!this.vazia()) {
            fim = (ini + n - 1) % tamanho;
            elemento = this.vetor.get(fim);
            n--;
        }
        return elemento;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(vetor.get((ini + i) % tamanho));
            if (i < n - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

}