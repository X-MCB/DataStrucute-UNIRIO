package EX05_Binário;

import java.util.Vector;

public class FilaGenerica<T> {
    /* Atributos protected para serem usados na subclasse. */
    protected int tamanho;    /* Tamanho do vetor */
    protected Vector<T> vetor;    /* Vetor de elementos */
    protected int ini;    /* Posicao do proximo elemento a ser retirado */
    protected int n;    /* Numero de elementos na fila */

    public FilaGenerica(int tamanho) {
        this.tamanho = tamanho;
        this.vetor = new Vector<T>(tamanho);
        this.ini = 0;
        this.n = 0;
    }

    public boolean vazia() {
        return (n == 0);
    }

    public boolean cheia() {
        return (n == tamanho);
    }

    //Retiramos o elemento do inÌcio da fila
    public T remove() {
        T elemento = null;

        if (!this.vazia()) {
            elemento = this.vetor.get(ini);
            ini = (ini + 1) % tamanho;
            n--;
        }

        return elemento;
    }

    //Inserimos o elemento no final da fila
    public boolean insere(T elemento) {
        int fim;

        if (!cheia()) {
            fim = (ini + n) % tamanho;
            this.vetor.add(fim, elemento);
            n++;
            return true;
        } else
            return false;
    }

    public static void geraBinario(int n) {
        FilaGenerica<String> fila = new FilaGenerica<>(100);//Tamanho Default
        fila.insere("1");

        for (int i = 1; i <= n; i++){
            String binario = fila.remove();
            System.out.println(binario);

            String zero = binario + "0";
            String um = binario + "1";

            fila.insere(zero);
            fila.insere(um);
        }
    }
}