package EX04;

public class Main {
    public static void main(String[] args) {

        /*
         COMPLEXIDADE DO MÉTODO REMOVEINTERVALO É EM MEDIA O(N LOG N) ONDE
         'N'É A QUANTIDADE DE ELEMENTOS NA ÁRVORE.
         */
        ArvBinBusca<Integer, Integer> arvoreBin = new ArvBinBusca<>();

        int tam = 10;//tamanho aleatorio de exemplo
        arvoreBin.constroiArvore(tam);

        System.out.println("Arvore: ");
        arvoreBin.mostra();
        System.out.println();
        System.out.println();
        boolean rem = arvoreBin.removeForaIntervalo(-20,40);//valores aleatorios de exemplo

        if(rem == true){
            System.out.println("Arvore após remocao: ");
            arvoreBin.mostra();
        }
        else if(rem == false){
            System.out.println("Arvore sem os elementos removidos: ");
            arvoreBin.mostra();
        }
    }
}
