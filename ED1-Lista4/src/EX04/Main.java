package EX04;

public class Main {
    public static void main(String[] args) {
        String frase = "Jesus Cristo, que calor dos infernos";

        Lista<String> listaTokens = new Lista<String>();

        String[] tokens = frase.split(" ");
        for (int i = 0; i < tokens.length; i++) {
            listaTokens.insere(tokens[i]);
        }

        System.out.println("Frase original: " + frase);
        System.out.println("Frase a partir da lista de tokens: " + listaTokens.retornaFrase(listaTokens));
        /* Complexidade O(n). o método irá percorrer toda a
        lista até o ultimo elemento. Portanto, a complexidade será
        relacionada a quantidade(n) de elementos presentes na lista
         */
    }
}
