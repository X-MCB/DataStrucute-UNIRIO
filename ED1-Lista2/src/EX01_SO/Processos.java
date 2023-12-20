package EX01_SO;

public class Processos {
    private int id;

    public Processos(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return String.format("Id: %d", id);
    }
}
