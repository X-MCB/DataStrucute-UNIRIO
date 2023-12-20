package EX01_SO;

import java.util.Scanner;

public class SistemaOperacional {
    private final int MAX_PROCESSOS = 100;
    private FilaGenerica<Processos> processos;

    public SistemaOperacional() {
        processos = new FilaGenerica<>(MAX_PROCESSOS);
    }


    public void MenuDeOperacoes(){
        Scanner scanner = new Scanner(System.in);
        int opcao;
        int id;

        do{
            System.out.println("Menu de Operacoes: ");
            System.out.println("1 - Adicionar Processo");
            System.out.println("2 - Retirar Processo");
            System.out.println("3 - Imprimir Lista de Processos");
            System.out.println("4 - Sair");
            System.out.printf("Digite a opcao desejada: ");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1 :
                    System.out.println("Coloque a id do processo que deseja adicionar: ");
                    id = scanner.nextInt();
                    Processos processo = new Processos(id);
                    processos.insere(processo);
                    break;
                case 2 :
                    System.out.println("O processo de maior tempo de espera será retirado: ");
                    if(!processos.vazia())
                        processos.removeFim();
                    else
                        System.out.println("Lista está vazia");
                    break;
                case 3 :
                    System.out.println("Lista de Processos: ");
                    System.out.println(processos.toString());
                    break;
                case 4 :
                    System.out.println("Fechando Menu!");
                    break;
                default :
                    System.out.println("Opcao Invalida!");
            }


        }while(opcao != 4);

    }
}
