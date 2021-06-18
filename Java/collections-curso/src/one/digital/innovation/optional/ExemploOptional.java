package one.digital.innovation.optional;

import java.util.Optional;

/**
 * Author Jairo Nascimento em 18/06/2021 as 16:46
 */
public class ExemploOptional {

  public static void main(String[] args) {

    Optional<String> optionalString = Optional.of("Valor presente");

    System.out.println(optionalString.isPresent());
    optionalString.ifPresent(System.out::println);

    optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Valor não esta presente"));

    if (optionalString.isPresent()) {
      String valor = optionalString.get();

      System.out.println(valor);
    }

    optionalString.map((valor) -> valor.concat("*****")).ifPresent(System.out::println);

    String optional = optionalString.orElseThrow(IllegalStateException::new);
    System.out.println(optional);

  }

}
