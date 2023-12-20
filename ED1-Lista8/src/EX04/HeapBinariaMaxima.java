package EX04;

import java.util.ArrayList;

public class HeapBinariaMaxima<T extends Comparable<T>>
{
	private int n;               /* Numero de elementos no heap. */   
	private int tam;             /* Tamanho m�ximo do heap. */
	private T[] vetor;          /* Vetor com elementos. */

	/* Constr�i heap vazio. */
	public HeapBinariaMaxima(int tamanho)
	{
		n = 0;
		tam = tamanho;
		vetor = (T[]) new Comparable[tamanho + 1];
	}


	//METDO QUE TRANSFORMA ARVORE BINARIA EM HEAP MAXIMA
	public void transformaHeapMaxima(ArvBinBusca<T, T> arvore) {
		ArrayList<T> listaArvore = new ArrayList<>();
		percorreArvore(arvore.raiz, listaArvore);
		constroiHeapMaxima(listaArvore);
	}

	//METODO AUXILIAR QUE PERCORRE A ARVORE E ADICIONA OS VALORES NUM ARRAY
	private void percorreArvore(ArvBinBusca.No no, ArrayList<T> listaArvore) {
		if (no != null) {
			percorreArvore(no.esq, listaArvore);
			listaArvore.add((T) no.chave);
			percorreArvore(no.dir, listaArvore);
		}
	}

	//METODO AUXILIAR QUE CONSTROI A HEAP A PARTIR DO ARRAY
	private void constroiHeapMaxima(ArrayList<T> listaArvore) {
		n = listaArvore.size();

		for (int i = 0; i < n; i++) {
			vetor[i + 1] = listaArvore.get(i);
		}

		for (int i = n / 2; i > 0; i--) {
			refaz(i);
		}
	}

	/* Testa se a fila de prioridade est� logicamente vazia.
	   Retorna true se vazia, false, caso contr�rio. */
	public boolean vazia()
	{
		return n == 0;
	}

	/* Faz a lista de prioridades logicamente vazia. */
	public void fazVazia()
	{
		n = 0;
	}

	//METODO AUXILIAR PRA PEGAR TAMANHO
	public int Tamanho() {
		return n;
	}


	/* Imprime os elementos da heap. */
	public void imprime()
	{
		for(int i = 1; i <= n; i++)
			System.out.print(vetor[i] + " ");

		System.out.println();
	}
	
	/* Imprime os elementos da heap at� o tamanho m�ximo do vetor, a contar de 1.
	 * Este m�todo � utilizado somente ap�s a aplica��o do Heapsort. */
	public void imprimeTamanho()
	{
		for(int i = 1; i <= tam; i++)
			System.out.print(vetor[i] + " ");
		
		System.out.println();
	}


	/* M�todo auxiliar que estabelece a propriedade de ordem do heap a 
	 * partir de um vetor arbitr�rio dos itens. */
	private void constroiHeap()
	{
		/* As posi��es n at� a posi��o (n / 2) + 1 j� constituem uma heap,
		 * pois s�o folhas. */
		for( int i = n / 2; i > 0; i-- )
			refaz(i);
	}

	/* M�todo auxiliar para restaurar a propriedade de heap que
	 * n�o est� sendo respeitada pelo n� i. */
	private void refaz(int i) {
		T x = vetor[i];

		while (2 * i <= n) {
			int filhoEsq, filhoDir, maiorFilho;

			filhoEsq = 2 * i;
			filhoDir = 2 * i + 1;
			maiorFilho = filhoEsq;

			if (filhoDir <= n) {

				if (vetor[filhoDir].compareTo(vetor[filhoEsq]) > 0)
					maiorFilho = filhoDir;
			}

			if (vetor[maiorFilho].compareTo(x) > 0)
				vetor[i] = vetor[maiorFilho];
			else
				break;

			i = maiorFilho;
		}

		vetor[i] = x;
	}


	/* Implementa o algoritmo de ordena��o Heapsort. */
	public void heapsort()
	{
		T x;
		int resta = n;
		int raiz = 1;
		constroiHeap();
		
		while (resta > 1)
		{
			x = (T) vetor[raiz];
			vetor[raiz] = vetor[resta];
			vetor[resta] = x;
			resta--;
			n--;
			refaz(raiz);
		}
	}
}