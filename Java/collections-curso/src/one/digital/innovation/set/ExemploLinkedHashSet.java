package one.digital.innovation.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * Author Jairo Nascimento em 18/06/2021 as 13:44
 */
public class ExemploLinkedHashSet {

  public static void main(String[] args) {

    LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

    //Adiciona as notas no set
    // Mantem a ordem de entrada
    sequenciaNumerica.add(16);
    sequenciaNumerica.add(8);
    sequenciaNumerica.add(2);
    sequenciaNumerica.add(4);
    sequenciaNumerica.add(1);

    System.out.println(sequenciaNumerica);

    //Remove a nota do Set
    sequenciaNumerica.remove(4);
    System.out.println(sequenciaNumerica);

    //Retorna a quantidade de itens do set
    System.out.println(sequenciaNumerica.size());

    // Navega por todos os itens do iterator
    Iterator<Integer> iterator = sequenciaNumerica.iterator();

    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    System.out.println("\n---------------------------");
    for (Integer numero: sequenciaNumerica) {
      System.out.println(numero);
    }

    System.out.println("\n----------Esta Vazia?-----------------");
    sequenciaNumerica.clear();
    System.out.println(sequenciaNumerica.isEmpty());

  }

}
