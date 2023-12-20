package EX05;

public class Main {
    public static void main(String[] args) {
        String frase = "Jesus Cristo, que calor dos infernos";

        Lista<String> listaTokens = new Lista<String>();

        String[] tokens = frase.split(" ");
        for (int i = 0; i < tokens.length; i++) {
            listaTokens.insere(tokens[i]);
        }

        System.out.println("Frase original: " + frase);
        System.out.print("Frase invertida: ");
        listaTokens.fraseInvertida();
        /*Complexidade O(n), o for existente no metodo frase invertida
          irá percorrer todos os elementos presentes na lista para realizar a inversao
          . Portanto, a complexidade irá variar dependendo do tamanho da frase.
         */
    }
}
