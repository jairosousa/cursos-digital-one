package one.digital.innovation.comparators;

import java.util.Comparator;

/**
 * Author Jairo Nascimento em 18/06/2021 as 15:42
 */
public class EstudanteOrdemIdadeReversaComparator implements Comparator<Estudante> {

  @Override
  public int compare(Estudante e1, Estudante e2) {
    return e2.getIdade() - e1.getIdade();
  }
}
