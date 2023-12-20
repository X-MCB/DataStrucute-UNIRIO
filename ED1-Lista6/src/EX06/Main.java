package EX06;

public class Main {
    public static void main(String[] args) {
        ArvBinBusca<Integer, Integer> arvoreBin = new ArvBinBusca<>();
        int tam = 10;

        arvoreBin.constroiArvore(tam);

        if(arvoreBin.eBalanceada()){
            System.out.println("É Balanceada");
        }
        else if (!arvoreBin.eBalanceada()) {
            System.out.println("Nao é Balanceada");
        }
    }
}
