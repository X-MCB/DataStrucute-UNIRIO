package EX07;

public class Inimigo {
    private String nome;//Criado para imprimir lista de nomes dos inimigos
    private int vida;
    private double danoPorSegundo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVida(int vida){
        this.vida = vida;
    }
    public int getVida(){
        return vida;
    }
    public void setDanoPorSegundo(double danoPorSegundo){
        this.danoPorSegundo = danoPorSegundo;
    }
    public double getDanoPorSegundo(){
        return danoPorSegundo;
    }
}
