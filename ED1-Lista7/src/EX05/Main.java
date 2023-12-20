package EX05;

public class Main {
    public static void main(String[] args) {
       RedBlackBST<Integer, Integer> rubronegra = new RedBlackBST<>();
        int tam = 10;//usado pra teste
        for(int i = 1; i < tam; i++){
            rubronegra.put(i,i);
        }
    }
    //ALTERACOES PRESENTES NA CLASSE REDBLACKBST
}
