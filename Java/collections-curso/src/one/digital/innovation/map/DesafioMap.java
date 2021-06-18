package one.digital.innovation.map;

import java.util.HashMap;
import java.util.Map;

public class DesafioMap {

    public static void main(String[] args) {

        Map<String, String> capitais = new HashMap<>();

        // Adicionar os campeos mundiais da FIFA
        capitais.put("RS","Porto Alegre");
        capitais.put("PB","João Pessoa");
        capitais.put("TO","Palmas");
        capitais.put("RJ","Rio de Janeiro");
        capitais.put("AM","Manaus");
//        capitais.put(null,"Sao Paulo");
//        capitais.put(null,"Florianopolis");
//        System.out.println(capitais.get("SC"));


        System.out.println(capitais);
        System.out.println(capitais.get("SC"));



    }
}
