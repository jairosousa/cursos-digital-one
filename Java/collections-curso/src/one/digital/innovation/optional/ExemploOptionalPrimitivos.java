package one.digital.innovation.optional;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

/**
 * Author Jairo Nascimento em 18/06/2021 as 16:41
 */
public class ExemploOptionalPrimitivos {

  public static void main(String[] args) {

    System.out.println("\n01 - Valor inteiro optional");
    OptionalInt.of(12).ifPresent(System.out::println);

    System.out.println("\n02 - Valor decimal optional");
    OptionalDouble.of(55.2).ifPresent(System.out::println);

    System.out.println("\n03 - Valor longo optional");
    OptionalLong.of(23L).ifPresent(System.out::println);

  }
}
