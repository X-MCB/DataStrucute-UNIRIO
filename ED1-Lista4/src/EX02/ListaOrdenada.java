package EX02;

public class ListaOrdenada extends Lista{
    /* Insere elemento na lista na posiÁ„o adequada, mantendo-a ordenada. */
    public void insere(int novo)
    {
        Elo p, q;
        Elo ant = null;

        q = new Elo(novo);

        for (p = prim; ((p != null) && (p.dado < novo)); p = p.prox)
            ant = p;

        if (ant == null)
            prim = q;
        else
            ant.prox = q;

        q.prox = p;
    }

    /* Remove da lista o primeiro elemento com valor igual a ìelem". Ret. true se removeu. */
    public boolean remove(int elem)
    {
        Elo p;
        Elo ant = null; /* referÍncia para anterior */

        for(p = prim; ((p != null) && (p.dado < elem)); p = p.prox)
            ant = p;

        /* Se p È null ou p.dado != elem, ent„o n„o encontrou elemento. */
        if ((p == null) || (p.dado != elem))
            return false;

        if (p == prim)
            prim = prim.prox; /* Remove elemento do inÌcio. */
        else
            ant.prox = p.prox;  /* Remove elemento do meio. */

        /* Remove a ˙ltima referÍncia para o elo a ser removido. Dessa forma,
         * o Garbage Collector ir· liberar essa memÛria. */
        p = null;

        return true;
    }

    public static void ordena(ListaOrdenada l1, ListaOrdenada l2){
      ListaOrdenada listaMista = new ListaOrdenada();
      Elo p1, p2;

          for(p1 = l1.prim, p2 = l2.prim ; p1 != null && p2 != null ; p1 = p1.prox, p2 = p2.prox){
              listaMista.insere(p1.dado);
              listaMista.insere(p2.dado);
          }

      listaMista.imprime();
    }
}
