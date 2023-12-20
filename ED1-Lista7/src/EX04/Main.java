package EX04;

public class Main {
    public static void main(String[] args) {
        RedBlackBST<Integer, Integer> rubronegra = new RedBlackBST<>();
        int tam = 10;//usado pra teste
        for(int i = 1; i <= tam; i++){
            rubronegra.put(i,i);
        }

        System.out.println("Informacoes do Ultimo no Acessado: ");
        System.out.println(rubronegra.ImprimirUltimoNoAcessado());
    }
}
