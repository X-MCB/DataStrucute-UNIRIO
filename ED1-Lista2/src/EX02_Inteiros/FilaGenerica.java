package EX02_Inteiros;

import java.util.Vector;

public class FilaGenerica<T>
{
    /* Atributos protected para serem usados na subclasse. */
    protected int tamanho;    /* Tamanho do vetor */
    protected Vector<T> vetor;    /* Vetor de elementos */
    protected int ini;    /* Posicao do proximo elemento a ser retirado */
    protected int n;    /* Numero de elementos na fila */

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

    public void combinaFilas(FilaGenerica f1, FilaGenerica f2){
        FilaGenerica<Integer> filaMista = new FilaGenerica<>(f1.tamanho + f2.tamanho);

        while (!f1.vazia() || !f2.vazia()) {
            if (!f1.vazia()) {
                filaMista.insere((Integer) f1.remove());
            }
            if (!f2.vazia()) {
                filaMista.insere((Integer) f2.remove());
            }
        }

        while (!filaMista.vazia()) {
            System.out.print(filaMista.remove());
        }
    }
}