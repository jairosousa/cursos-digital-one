package one.digital.innovation.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Author Jairo Nascimento em 18/06/2021 as 15:45
 */
public class ComparatorsExampleList {

  public static void main(String[] args) {

    List<Estudante> estudantes = new ArrayList<>();

    estudantes.add(new Estudante("Pedro", 19));
    estudantes.add(new Estudante("Carlos", 23));
    estudantes.add(new Estudante("Mariana", 21));
    estudantes.add(new Estudante("João", 18));
    estudantes.add(new Estudante("Thiago", 20));
    estudantes.add(new Estudante("George", 22));
    estudantes.add(new Estudante("Larissa", 21));

    System.out.println("\n ----- Ordem de inserção -----");
    System.out.println(estudantes);

    System.out.println("\n ----- Ordem natural dos números - idade -----");
    estudantes.sort((first, second) -> first.getIdade() - second.getIdade());
    System.out.println(estudantes);

    System.out.println("\n ----- Ordem reversa dos numeros - idade -----");
    estudantes.sort((first, second) -> second.getIdade() - first.getIdade());
    System.out.println(estudantes);

    System.out.println("\n ----- Ordem natural dos numeros - idade (method reference) -----");
    estudantes.sort((Comparator.comparingInt(Estudante::getIdade)));
    System.out.println(estudantes);

    System.out.println("\n ----- Ordem reversa dos numeros - idade (method reference) -----");
    estudantes.sort((Comparator.comparingInt(Estudante::getIdade).reversed()));
    System.out.println(estudantes);

    System.out.println("\n ----- Ordem natural dos numeros - idade (interface comparable) -----");
    Collections.sort(estudantes);
    System.out.println(estudantes);

    System.out.println("\n ----- Ordem reversa dos numeros - idade (interface comparable) -----");
    Collections.sort(estudantes, new EstudanteOrdemIdadeReversaComparator());
    System.out.println(estudantes);

  }

}
