package one.digital.innovation.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Author Jairo Nascimento em 18/06/2021 as 13:44
 */
public class ExemploHasSet {

  public static void main(String[] args) {

    Set<Double> notasAlunos = new HashSet<>();

    //Adiciona as notas no set
    // Não obedece a ordem de entrada
    notasAlunos.add(5.8);
    notasAlunos.add(9.3);
    notasAlunos.add(6.5);
    notasAlunos.add(10.0);
    notasAlunos.add(5.4);
    notasAlunos.add(7.3);
    notasAlunos.add(3.8);
    notasAlunos.add(4.0);

    System.out.println(notasAlunos);

    //Remove a nota do Set
    notasAlunos.remove(3.8);
    System.out.println(notasAlunos);

    //Retorna a quantidade de itens do set
    System.out.println(notasAlunos.size());

    // Navega por todos os itens do iterator
    Iterator<Double> iterator = notasAlunos.iterator();

    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    System.out.println("\n---------------------------");
    for (Double nota: notasAlunos) {
      System.out.println(nota);
    }

    System.out.println("\n----------Esta Vazia?-----------------");
    notasAlunos.clear();
    System.out.println(notasAlunos.isEmpty());

  }

}
