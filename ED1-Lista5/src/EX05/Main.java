package EX05;

public class Main {
    public static void main(String[] args) {
        ListaDuplamente L1 = new ListaDuplamente();
        ListaDuplamente L2 = new ListaDuplamente();

        //Primeiro teste para mostrar que sao iguais

        for(int i = 0; i < 5; i++){//tamanho arbitrario para exemplo
            L1.insere(i);
        }
        for(int i = 0; i < 5; i++){//tamanho arbitrario para exemplo
            L2.insere(i);
        }

        L1.imprime();
        L2.imprime();
        System.out.println();
        if(L1.verificaIgualdade(L2)){
            System.out.println("Listas são iguais!");
            System.out.println();
        }
        else {
            System.out.println("Listas não são iguais!");
            System.out.println();
        }


        //Segundo teste para mostrar que sao diferentes

        for(int i = 5; i < 10; i++){//tamanho arbitrario para exemplo
            L2.insere(i);
        }
        L1.imprime();
        L2.imprime();
        System.out.println();
        if(L1.verificaIgualdade(L2)){
            System.out.println("Listas são iguais!");
        }
        else
            System.out.println("Listas não são iguais!");
    }
}
