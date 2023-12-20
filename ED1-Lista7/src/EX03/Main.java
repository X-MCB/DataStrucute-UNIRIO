package EX03;

public class Main {
    public static void main(String[] args) {
        RedBlackBST<Integer, Integer> rubronegra = new RedBlackBST<>();
        int tam = 10;//usado pra teste
        for(int i = 1; i < tam; i++){
            rubronegra.put(i,i);
        }
        System.out.print("Altura Negra: ");
        System.out.println(rubronegra.alturaNegra());

        //Metodo alturaNegra possui complexidade O(n) onde n é o numero de nos da arvore
    }
}
