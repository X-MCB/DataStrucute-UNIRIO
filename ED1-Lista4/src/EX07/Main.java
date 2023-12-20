package EX07;

public class Main {
    public static void main(String[] args) {
        Inimigo ini1 = new Inimigo();
        ini1.setNome("Matheus");
        ini1.setVida(100);
        ini1.setDanoPorSegundo(5.0);

        Inimigo ini2 = new Inimigo();
        ini2.setNome("Andressa");
        ini2.setVida(150);
        ini2.setDanoPorSegundo(3.0);

        Inimigo ini3 = new Inimigo();
        ini3.setNome("Marcela");
        ini3.setVida(80);
        ini3.setDanoPorSegundo(4.0);

        /* Método insere inimigo possui complexidade O(1). O método simplesmente faz diversas atribuicoes
         que possuem, cada uma, complexidade O(1). Como a lista n precisa estar ordenada, a complexidade pode ser
         obtida simplesmente somando as atribuicoes O( 1 + 1 + 1) = O(1).
         */
        Lista lista = new Lista();
        lista.insere(ini1);
        lista.insere(ini2);
        lista.insere(ini3);

        /* Método que localiza inimigos possui complexidade O(n). O método utiliza um for para percorrer a lista
        em busca de determinado objeto. No pior caso, esse objeto estará ou no final(ultimo no), ou nao estará
        na lista. Logo, a complexidade é O(n) pois o que irá determinar o tempo de execucao é a quantidade de
        elementos(n) presente na lista.
         */
        System.out.println("Localizando Inimigos: ");
        System.out.println();
        lista.localizar(ini1);
        lista.localizar(ini2);
        lista.localizar(ini3);
        System.out.println();

        /*Método etapa de dano possui complexidade O(n). Assim como no metodo localizar, o método utiliza um for para
        percorrer a lista e fazer as devidas atribuicoes. A quantidade de atribuicoes será, tal qual no metodo localizar
        linearmente proporcional a quantidade de inimigos presentes na lista.
         */
        System.out.println("Etapa de Dano: ");
        System.out.println();
        lista.efetuarDano(ini1, 80);
        lista.efetuarDano(ini2, 150);
        lista.efetuarDano(ini3, 60);
        System.out.println();

        System.out.println("Localizando Inimigos: ");
        System.out.println();
        lista.localizar(ini1);
        lista.localizar(ini2);
        lista.localizar(ini3);
        System.out.println();

        /*Também possui complexidade O(n) pois seu tempo é proporcional a quantidade de inimigos que devem ser impressos

         */
        lista.imprime();
    }
}
