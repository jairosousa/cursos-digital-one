package one.digital.innovation.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Author Jairo Nascimento em 18/06/2021 as 17:54
 */
public class ExemploStreamAPI {

  public static void main(String[] args) {

    // Cria coleção de estudantes
    List<String> estudantes = new ArrayList<>();
    estudantes.add("Pedro");
    estudantes.add("Thayse");
    estudantes.add("Marcelo");
    estudantes.add("Carla");
    estudantes.add("Carla");
    estudantes.add("Juliana");
    estudantes.add("Thiago");
    estudantes.add("Rafael");

    System.out.println("\n01 - Retorna a contagem de elementos do stream");
    System.out.println("Contagem: " + estudantes.stream().count());

    System.out.println("\n02 - Retorna o elemento com o maior numero de letras");
    System.out.println("Maior numero de letras: " + estudantes.stream()
        .max(Comparator.comparingInt(String::length)));

    System.out.println("\n03 - Retorna o elemento com o menor numero de letras");
    System.out.println("Menor numero de letras: " + estudantes.stream()
        .min(Comparator.comparingInt(String::length)));

    System.out.println("\n04 - Retorna o elemento com o a letra r no nome");
    System.out.println("Letra r no nome: " + estudantes.stream().filter(estudante ->
        estudante.toLowerCase().contains("r")).collect(Collectors.toList()));

    System.out.println(
        "\n05 - Retorna uma nova coleção com os nomes concatenados a quantidade de letras de cada nome");
    System.out.println("Retorna uma nova coleção com a quantidade de letras: " + estudantes.stream()
        .map(estudante ->
            estudante.concat(" - ").concat(String.valueOf(estudante.length())))
        .collect(Collectors.toList()));

    System.out.println("\n06 - Retorna somente os 3 primeiros elementos da coleção");
    System.out.println("Retorna os 3 primeiros elementos: " + estudantes.stream().limit(3)
        .collect(Collectors.toList()));

    System.out.println("\n07 - Exibe cada elemento no console, e depois retorna a mesma coleção");
    System.out.println("Retorna os elementos: " + estudantes.stream().peek(System.out::println)
        .collect(Collectors.toList()));

    System.out.println("\n08 - Exibe cada elemento no console, sem retorna outra coleção");
    estudantes.stream().forEach(System.out::println);

    System.out.println("\n09 - Retorna true se todos os elemento possuem a letra W no nome");
    System.out.println("Todos os elemento tem o 'W' nome? " + estudantes.stream()
        .allMatch(elemento -> elemento.contains("W")));

    System.out
        .println("\n10 - Retorna true se algum os elementos possuem letra 'a' minuscula no nome");
    System.out.println("Tem algum elemento com 'a' minuscula no nome? " + estudantes.stream()
        .anyMatch(elemento -> elemento.contains("a")));

    System.out.println("\n11 - Retorn o primeiro elemento da coleção, se existir exibe no console");
    estudantes.stream().findFirst().ifPresent(System.out::println);

    System.out.println("\n12 - Operação encadeada");
    System.out.println(estudantes.stream()
        .peek(System.out::println)
        .map(estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length())))
        .peek(System.out::println)
        .filter((estudante) -> estudante.toLowerCase().contains("r"))
//        .collect(Collectors.toList()));
//        .collect(Collectors.joining(", ")));
//        .collect(Collectors.toSet()));
        .collect(
            Collectors.groupingBy(estudante -> estudante.substring(estudante.indexOf("-") + 1))));

  }

}
