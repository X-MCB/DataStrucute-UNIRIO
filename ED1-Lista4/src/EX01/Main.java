package EX01;

/*CODIGO TAMANHO:

    public int tamanho() {
        int tam = 0;
        O(1)
        Elo p = prim;
        O(1)

        while (p != null) O(n)
        {
            tam++;
            p = p.prox;
        }

        return tam;
    }
-------------------------------------------------------------------------------------------------
   /* O codigo possui complexidade O(n), já que no pior caso o while terá que percorrer todos os
    'n' elementos da lista. É possível transformar o método tamanho de interativo para recursivo
    Ficando dessa maneira:*/
/*
    public int tamanho() {
        return tamanhoRecursivo(prim);
    }

    private int tamanhoRecursivo(Elo p) {
        if (p == null) {
            return 0;
        }
        return 1 + tamanhoRecursivo(p.prox);
    }
}
*/

  /*Entretanto, ambos os métodos possuem a mesma complexidade O(n). Logo, não é possível melhorar a complexidade
  do método de forma direta já que inevitávelmente os métodos terão que percorrer o número de elementos('n') da lista.

  Portanto, a única maneira de reduzir a complexidade do método tamanho
  é atribuindo o incremeto, ou decremento, ou seja, a alteracao do atributo tamanho
  a outros métodos, nesse caso os métodos:

  insere e remove(checar codigo Lista para ver os métodos alterados).

  Que, respectivamente, incrementam e decrementam a variável tamanho conforme sao chamados.
  fazendo com que o método tamanho tenha a sua complexidade reduzida para O(1) já que só realiza
  uma atribuicao.
   */