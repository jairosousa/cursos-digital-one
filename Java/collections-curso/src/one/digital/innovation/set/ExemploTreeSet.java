package one.digital.innovation.set;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Author Jairo Nascimento em 18/06/2021 as 13:44
 */
public class ExemploTreeSet {

  public static void main(String[] args) {

    TreeSet<String> treeCapitais = new TreeSet<>();

    // Monta árvores com as capitais
    // Não matem a ordem de inserção, mais a ordem da árvore
    treeCapitais.add("Porto Alegre");
    treeCapitais.add("Florianopolis");
    treeCapitais.add("Curitiba");
    treeCapitais.add("São Paulo");
    treeCapitais.add("Rio de Janeiro");
    treeCapitais.add("Belo Horizonte");

    // Exibe todas as capitais no console
    System.out.println(treeCapitais);

    System.out.println("\n----------Retorna a primeira capital no topo da árvore-----------------");
    // Retorna a primeira capital no topo da arvore
    System.out.println(treeCapitais.first());

    System.out.println("\n----------Retorna a última capital no final da árvore-----------------");
    // Retorna a última capital no final da arvore
    System.out.println(treeCapitais.last());

    System.out.println(
        "\n----------Retorna a primeira capital abaixo na árvore da capital parametrizada-----------------");
    // Retorna a primeira capital abaixo na árvore da capital parametrizada
    System.out.println(treeCapitais.lower("Florianopolis"));

    System.out.println(
        "\n----------Retorna a primeira capital acima da árvore da capital parametrizada-----------------");
    // Retorna a primeira capital acima da árvore da capital parametrizada
    System.out.println(treeCapitais.higher("Florianopolis"));

    System.out.println("\n----------Todas as Capitais-----------------");
    System.out.println(treeCapitais);

    System.out.println(
        "\n----------Retorna a primeira capital no topo da Árvore, removendo da árvore-----------------");
    // Retorna a primeira capital no topo da Árvore, removendo da árvore
    System.out.println(treeCapitais.pollFirst());

    System.out.println(
        "\n----------Retorna a primeira capital no topo da Árvore, removendo da árvore-----------------");
    // Retorna a última capital no final da da Árvore, removendo da árvore
    System.out.println(treeCapitais.pollLast());

    System.out.println("\n----------Todas as Capitais-----------------");
    System.out.println(treeCapitais);

    System.out.println("\n----------Navega por todos os itens do iterator-----------------");
    // Navega por todos os itens do iterator
    Iterator<String> iterator = treeCapitais.iterator();

    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    System.out.println("\n----------Esta Vazia?-----------------");
    treeCapitais.clear();
    System.out.println(treeCapitais.isEmpty());

  }

}
