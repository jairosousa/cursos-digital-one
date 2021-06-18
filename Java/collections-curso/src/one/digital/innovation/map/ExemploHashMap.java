package one.digital.innovation.map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {

    public static void main(String[] args) {

        Map<String, Integer> campeosMundialFifa = new HashMap<>();

        // Adicionar os campeos mundiais da FIFA
        campeosMundialFifa.put("Brasil",5);
        campeosMundialFifa.put("Alemanha",4);
        campeosMundialFifa.put("Itália",4);
        campeosMundialFifa.put("Uruguai",2);
        campeosMundialFifa.put("Argentina",2);
        campeosMundialFifa.put("França",2);
        campeosMundialFifa.put("Ingraterra",1);
        campeosMundialFifa.put("Espanha",1);

        System.out.println(campeosMundialFifa);

        // Atualiza o valor para chave Brasil
        campeosMundialFifa.put("Brasil", 6);
        System.out.println(campeosMundialFifa);

        // Retorna a Argentina
        System.out.println(campeosMundialFifa.get("Argentina"));

        // Retorna se existe ou não um campeão França
        System.out.println(campeosMundialFifa.containsKey("França"));

        // Remove Campeão França
        campeosMundialFifa.remove("França");
        System.out.println(campeosMundialFifa.containsKey("França"));

        // Se existe Hexacampeão
        System.out.println(campeosMundialFifa.containsValue(6));

        // Retorna o tamanho do Map
        System.out.println(campeosMundialFifa.size());

        // Navega nos registros do Map
        for (Map.Entry<String, Integer> entry: campeosMundialFifa.entrySet()) {
            System.out.println(entry.getKey() + "----" + entry.getValue());
        }
        System.out.println("=============================");
        // Navega nos registros do Map
        for (String key : campeosMundialFifa.keySet()) {
            System.out.println(key + "----" + campeosMundialFifa.get(key));
        }

        campeosMundialFifa.clear();

        System.out.println(campeosMundialFifa.size());
    }
}
