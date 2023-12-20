package EX02;

public class Main {
    public static void main(String[] args) {

        /*
          COMPLEXIDADE DO MÉTODO REMOVEINTERVALO É EM MEDIA O(N LOG N) ONDE
         'N'É A QUANTIDADE DE ELEMENTOS DO VETOR.
         */

        int[] vet = {3,4,6,5,21,13,45,9,2,1};

        ArvBinBusca arvorebin = new ArvBinBusca<>();

        arvorebin.constroiArvore(vet);

        System.out.println("Arvore: ");
        arvorebin.mostra();
    }
}
