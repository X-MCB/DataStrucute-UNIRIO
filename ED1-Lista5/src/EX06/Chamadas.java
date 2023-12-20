package EX06;

public class Chamadas {
    private String numeroTel;
    private double custoMinuto;

    public Chamadas(String numeroTel, double custoMinuto) {
        this.numeroTel = numeroTel;
        this.custoMinuto = custoMinuto;
    }

    public String getNumeroTel() {

        return numeroTel;
    }

    public double getCustoMinuto() {

        return custoMinuto;
    }

    @Override
    public String toString() {

        return "Número de Telefone: " + numeroTel + ", Custo por Minuto: " + custoMinuto;
    }
}
