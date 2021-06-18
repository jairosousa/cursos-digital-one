package one.digital.innovation.map;

import java.util.Hashtable;
import java.util.Map;

public class ExemploHashTable {

    public static void main(String[] args) {

        Hashtable<String, Integer> estudantes = new Hashtable<>();

        // Adicionar os campeos mundiais da FIFA
        estudantes.put("Carlos",21);
        estudantes.put("Mariana",33);
        estudantes.put("Rafaela",18);
        estudantes.put("Pedro",44);

        System.out.println(estudantes);

        // Removendo um estudante indice 0
        estudantes.remove("Pedro");
        System.out.println(estudantes);

        // Recupera um estudante indice 2
        Integer idadeEstudante = estudantes.get("Mariana");
        System.out.println(idadeEstudante);

        // Navega nos registros do Map
        for (Map.Entry<String, Integer> entry: estudantes.entrySet()) {
            System.out.println(entry.getKey() + "----" + entry.getValue());
        }
        System.out.println("=============================");
        // Navega nos registros do Map
        for (String key : estudantes.keySet()) {
            System.out.println(key + "----" + estudantes.get(key));
        }

        estudantes.clear();

        System.out.println(estudantes.size());
    }
}
