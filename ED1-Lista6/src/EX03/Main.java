package EX03;

public class Main {
    public static void main(String[] args) {

        /*
          COMPLEXIDADE DO METODO TRANSFORMAARVBINBUSCA É EM MÉDIA, O( N LOG N).
          ONDE 'N'É A QUANTIDADE DE ELEMENTOS NA ÁRVORE.
         */

        ArvBinBusca<Integer, Integer> arvoreBin = new ArvBinBusca<>();
        ArvBinBusca<Integer, Integer> arvoreBin2 = new ArvBinBusca<>();
        int tam = 10;

        arvoreBin.constroiArvore(tam);
        arvoreBin2.constroiArvore(tam);

        System.out.println("Arvores Binarias: ");
        arvoreBin.mostra();
        System.out.println();
        arvoreBin2.mostra();

        System.out.println();
        System.out.println();
        System.out.println("Sao simlares? ");
        if(arvoreBin.eSimilar(arvoreBin2)){
            System.out.println("Sao similares!");
        }
        else if (!arvoreBin.eSimilar(arvoreBin2)) {
            System.out.println("Nao sao similares");
        }
    }
}
