package EX01_StringInversa;

public class StringABBA {

    public static boolean verificaString(String str){

        if(str == null || str.isEmpty())
            return false;
        for( int i = 0; i < str.length(); i++ ){
            char c = str.charAt(i);
            if(!(c == 'A' || c == 'B' || c == 'a' || c == 'b'))
                return false;
        }
        return true;
    }

    public static boolean verificaABBA(String str) {
        if (verificaString(str)) {
            PilhaGenerica<Character> pilha = new PilhaGenerica<>(str.length());

            // Preenche metade da pilha com os caracteres da string
            for (int i = 0; i < str.length() / 2; i++) {
                pilha.push(str.charAt(i));
            }

            // Verifica se a outra metade da string é o inverso
            int meio = (str.length() % 2 == 0) ? str.length() / 2 : str.length() / 2 + 1;
            for (int i = meio; i < str.length(); i++) {
                char c = str.charAt(i);
                if (pilha.vazia() || pilha.pop() != c) {
                    return false;
                }
            }

            // Verifica se a pilha está vazia no final
            if (!pilha.vazia()) {
                return false;
            }
        } else {
            return false;
        }

        return true;
    }
}
