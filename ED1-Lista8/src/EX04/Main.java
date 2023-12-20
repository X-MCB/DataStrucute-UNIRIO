package EX04;

public class Main {
    public static void main(String[] args) {
        int[] vet = {10, 30, 40, 20, 60, 35, 70};
        ArvBinBusca arvorebin = new ArvBinBusca<>();
        arvorebin.constroiArvore(vet);

        HeapBinariaMaxima heap_max = new HeapBinariaMaxima<>(7);
        heap_max.transformaHeapMaxima(arvorebin);
        heap_max.heapsort();
        heap_max.imprimeTamanho();

    }
}