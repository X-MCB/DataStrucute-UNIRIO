package EX05_BALANCEADO;

public class Balanceamento {

    public static boolean AbreSimbolo(char c){
        if(c == '{' || c == '[' || c == '(')
            return true;
        else
            return false;
    }

    public static boolean FechaSimbolo(char c){
        if(c == '}' || c == ']' || c ==')')
            return true;
        else
            return false;
    }

    public boolean Equivalentes()
}
