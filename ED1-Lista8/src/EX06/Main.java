package EX06;

public class Main {
    public static void main(String[] args) {
        int [] vet = {10, 30, 40, 20, 60, 35, 70};
        HeapBinariaMaxima heap_max = new HeapBinariaMaxima(7, vet);
        System.out.println("Original: ");
        heap_max.imprime();
        System.out.println();
        heap_max.remove(2);
        System.out.println();
        System.out.println("Novo Heap:");
        heap_max.imprime();
    }
}
