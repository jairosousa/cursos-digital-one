package one.digital.innovation.map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {

    public static void main(String[] args) {

        TreeMap<String, String> treeCapitais = new TreeMap<>();

        // Adicionar os campeos mundiais da FIFA
        treeCapitais.put("RS", "Porto Alegre");
        treeCapitais.put("SC", "Florianopolis");
        treeCapitais.put("PR", "Curitiba");
        treeCapitais.put("SP", "São Paulo");
        treeCapitais.put("RJ", "Rio Janeiro");
        treeCapitais.put("BH", "Belo Horizonte");
        treeCapitais.put("PA", "Belém");

        System.out.println(treeCapitais);

        // Retorna a primeira capital no topo da arvore
        System.out.println(treeCapitais.firstKey());

        // Retorna a última capital no topo da arvore
        System.out.println(treeCapitais.lastKey());

        // Retorna a primeira capital abaixo da capital parametrizada
        System.out.println(treeCapitais.lowerKey("SC"));

        // Retorna a primeira capital acima da capital parametrizada
        System.out.println(treeCapitais.higherKey("SC"));

        // Retorna a primeira capital no topo da Árvore
        System.out.println(treeCapitais.firstEntry().getKey() + " - " + treeCapitais.firstEntry().getValue());

        // Retorna a última capital no topo da Árvore
        System.out.println(treeCapitais.lastEntry().getKey() + " - " + treeCapitais.lastEntry().getValue());

        // Retorna a primeira capital  abaixo da capital parametrizada
        System.out.println(treeCapitais.lowerEntry("SC").getKey() + " - " + treeCapitais.lowerEntry("SC").getValue());

        // Retorna a primeira capital  acima da capital parametrizada
        System.out.println(treeCapitais.higherEntry("SC").getKey() + " - " + treeCapitais.higherEntry("SC").getValue());


        // Exibe todas as capitais no console
        System.out.println(treeCapitais);
        Map.Entry<String, String> firstEntry = treeCapitais.pollFirstEntry();
        Map.Entry<String, String> lastEntry = treeCapitais.pollLastEntry();

        // Retorna a primeira capital no topo da Árvore, removendo Map
        System.out.println(firstEntry.getKey() + " - " + firstEntry.getValue());

        // Retorna a última capital no topo da Árvore, removendo Map
        System.out.println(lastEntry.getKey() + " - " + lastEntry.getValue());

        // Exibe todas as capitais no console
        System.out.println(treeCapitais);

        //Navega por todas a schaves do Iterator

        Iterator<String> iterator = treeCapitais.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + " ==> " + treeCapitais.get(key));
        }

        for (String capital : treeCapitais.keySet()) {
            System.out.println(capital + " => " + treeCapitais.get(capital));
        }

        for (Map.Entry<String, String> capital : treeCapitais.entrySet()) {
            System.out.println(capital.getKey() + " => " + capital.getValue());
        }

        treeCapitais.clear();

        System.out.println(treeCapitais.size());
    }
}
