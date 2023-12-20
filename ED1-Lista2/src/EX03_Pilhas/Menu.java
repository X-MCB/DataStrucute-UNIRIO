package EX03_Pilhas;

import EX02_Inteiros.FilaGenerica;

import java.util.Scanner;

public class Menu {

    public void Escolha(){
        Scanner scanner = new Scanner(System.in);
        int opcao;
        System.out.print("Menu de Operacoes");
        System.out.println("Escolha a operacao que deseja realizar: ");
        System.out.println("1. Fila de Pilhas");
        System.out.println("2. Pilha de Filas");
        System.out.println("3. Fila de Filas");
        opcao = scanner.nextInt();

        switch(opcao){
            case 1:
                System.out.print("Coloque a quantidade de pilhas: ");
                int qtdpilhas = scanner.nextInt();
                EX02_Inteiros.FilaGenerica<PilhaGenerica> filaPilha = new FilaGenerica<>(100);//Usando como default

                for(int i = 0; i < qtdpilhas; i++){
                    System.out.printf("Coloque o tamanho da pilha %d: ", i + 1);
                    int tamPilha = scanner.nextInt();
                    PilhaGenerica<Integer> pilha = new PilhaGenerica<Integer>(tamPilha);
                    for(int j = 0; j < tamPilha; j++){
                        System.out.printf("Coloque um elemento a ser inserido na pilha %d: ", i + 1);
                        int elemento = scanner.nextInt();
                        pilha.push(elemento);
                    }
                    filaPilha.insere(pilha);
                }
                System.out.println("Fila de Pilhas: ");
                while (!filaPilha.vazia()) {
                    PilhaGenerica<Integer> pilha = filaPilha.remove();
                    while (!pilha.vazia()) {
                        System.out.print(pilha.pop() + " ");
                    }
                    System.out.println();
                }
                break;

            case 2:
                System.out.print("Coloque a quantidade de filas: ");
                int qtdFilas = scanner.nextInt();
                PilhaGenerica<FilaGenerica> pilhaFila = new PilhaGenerica<>(100);//Usando como default

                for(int i = 0; i < qtdFilas; i++){
                    System.out.printf("Coloque o tamanho da fila %d: ", i + 1);
                    int tamFila = scanner.nextInt();
                    FilaGenerica<Integer> fila = new FilaGenerica<Integer>(tamFila);
                    for(int j = 0; j < tamFila; j++){
                        System.out.printf("Coloque um elemento a ser inserido na fila %d: ", i + 1);
                        int elemento = scanner.nextInt();
                        fila.insere(elemento);
                    }
                    pilhaFila.push(fila);
                }
                System.out.println("Pilha de Filas: ");
                while (!pilhaFila.vazia()) {
                    FilaGenerica<Integer> fila = pilhaFila.pop();
                    while (!fila.vazia()) {
                        System.out.print(fila.remove() + " ");
                    }
                    System.out.println();
                }
                break;

            case 3:

                System.out.print("Coloque a quantidade de filas: ");
                int qtd = scanner.nextInt();
                FilaGenerica<FilaGenerica> filasFila = new FilaGenerica<>(100);
                for(int i = 0; i < qtd; i++){
                    System.out.printf("Coloque o tamanho da fila %d: ", i + 1);
                    int tamFila = scanner.nextInt();
                    FilaGenerica<Integer> fila = new FilaGenerica<Integer>(tamFila);
                    for(int j = 0; j < tamFila; j++){
                        System.out.printf("Coloque um elemento a ser inserido na fila %d: ", i + 1);
                        int elemento = scanner.nextInt();
                        fila.insere(elemento);
                    }
                    filasFila.insere(fila);
                }

                System.out.println();
                System.out.print("Fila de Filas: ");
                while (!filasFila.vazia()) {
                    FilaGenerica<Integer> fila = filasFila.remove();
                    while (!fila.vazia()) {
                        System.out.print(fila.remove() + " ");
                    }
                    System.out.println();
                }

        }


    }


}
