package aprendendoColecoes.teste;

import aprendendoColecoes.dominio.Consumidor;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTeste01 {
    public static void main(String[] args) {
//        Map<String, String> map = new LinkedHashMap<>();// Para mantar os valores em ordem de inserção
        Map<String, String> map = new HashMap<>();//Chave e valor(String e String)
        map.put("teklado", "teclado");
        map.put("mouze", "mouse");// se você colocar a msm chave, o Map substitiu para o mais recente(o ultimo escrito, com ordem nas linhas do codigo)
        map.put("vc", "você");
        map.put("vc2", "você");
        map.putIfAbsent("vc", "você2");// IfAbsent adiciona caso não exista um valor com a chave passada
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        System.out.println("-------------------------");

        for(String valor : map.values()){
            System.out.println(valor);
        }

        System.out.println("-------------------------");

        for(Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey()+ ": "+entry.getValue());
        }
    }
}
