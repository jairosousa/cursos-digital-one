package one.digital.innovation.comparators;

/**
 * Author Jairo Nascimento em 18/06/2021 as 14:58
 */
public class Estudante implements Comparable<Estudante> {

  private final String nome;
  private final Integer idade;

  public Estudante(String nome, Integer idade) {
    this.nome = nome;
    this.idade = idade;
  }

  public String getNome() {
    return nome;
  }

  public Integer getIdade() {
    return idade;
  }

  @Override
  public String toString() {
    return "nome='" + nome + '\'' +
        ", idade=" + idade;
  }

  @Override
  public int compareTo(Estudante e) {
    return this.getIdade() - e.getIdade();
  }
}
