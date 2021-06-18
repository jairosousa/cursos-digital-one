package one.digital.innovation.optional;

import java.util.Optional;

/**
 * Author Jairo Nascimento em 18/06/2021 as 16:22
 */
public class ExemplosOptionalEstados {

  public static void main(String[] args) {

    System.out.println("\n 01 - Valor optional que esta presente");
    Optional<String> optionalString = Optional.of("Valor presente");
    optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Não esta presente"));

    System.out.println("\n 02 - Valor optional que não esta presente");
    Optional<String> optionalNull = Optional.ofNullable(null);
    optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("Null não esta presente"));

    System.out.println("\n 03 - Valor optional que não esta presente");
    Optional<String> emptyOptional = Optional.empty();
    emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("Não esta presente"));

    System.out.println("\n 04 - Valor optional que lança erro NullPointerException");
    Optional<String> optionalNullErro = Optional.of(null);
    optionalNullErro.ifPresentOrElse(System.out::println, () -> System.out.println("Não esta presente"));

  }

}
