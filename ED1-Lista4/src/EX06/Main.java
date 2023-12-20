package EX06;

public class Main {
    public static void main(String[] args){
        Lista<String> diretorio = new Lista<>();

        diretorio.inserePasta("Jogos");
        diretorio.inserePasta("Faculdade");
        diretorio.inserePasta("Filmes");

        diretorio.insere("Buraco","Jogos");
        diretorio.insere("Xadrez","Jogos");
        diretorio.insere("GO","Jogos");

        diretorio.insere("EDD","Faculdade");
        diretorio.insere("Calculo","Faculdade");
        diretorio.insere("GPN","Faculdade");
        diretorio.insere("ACEs","Faculdade");
        diretorio.insere("BD1","Faculdade");

        diretorio.insere("ACE1","ACEs");
        diretorio.insere("ACE2","ACEs");
        diretorio.insere("ACE3","ACEs");

        diretorio.insere("Super-heróicos","Filmes");
        diretorio.insere("Marvel","Super-heróicos");
        diretorio.insere("Vingadores","Marvel");
        diretorio.insere("Homem-Aranha","Marvel");
        diretorio.insere("DC","Super-heróicos");
        diretorio.insere("Superman","DC");

        diretorio.insere("Drama","Filmes");
        diretorio.insere("Comédias Românticas","Filmes");
        diretorio.insere("Dogville","Drama");

        System.out.println(diretorio);
        /*Todos os métodos(Que nao sejam os de atribuicao) utilizados
        possuem complexidade O(n).
         */
    }
}