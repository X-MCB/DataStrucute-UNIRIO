package EX04_CircularDupla;

public class FilaDupla extends Fila
{
    public FilaDupla(int tamanho) {
        super(tamanho);
    }

    public boolean insereInicio(int elemento)
    {
        int prec;

        if (!cheia())
        {
            /* Insere na posiÁ„o precedente ao inÌcio */
            prec = (ini - 1 + tamanho) % tamanho;
            vetor[prec] = elemento;
            ini = prec; /* Atualiza Ìndice para inÌcio */
            n++;
            return true;
        }
        else
            return false;
    }

    public int removeFim()
    {
        int elemento = Integer.MIN_VALUE;
        int ult;

        if (!this.vazia())
        {
            /* Retira o ˙ltimo elemento */
            ult = (ini + n - 1) % tamanho;
            elemento = vetor[ult];
            n--;
        }

        return elemento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < n; i++) {
            sb.append(vetor[(ini + i) % tamanho]);
            if (i < n - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
