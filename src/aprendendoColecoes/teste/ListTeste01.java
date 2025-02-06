package aprendendoColecoes.teste;

import java.util.ArrayList;
import java.util.List;

public class ListTeste01 {
    public static void main(String[] args) {
//        List nomes = new ArrayList(); // versão 1.4
//        nomes.add("Gabriel");
//        nomes.add("Gabriel2");
//
//        for(Object nome : nomes){
//            System.out.println(nome);
//        }
        List<String> nomes = new ArrayList<>(16); // versão 1.5 // Caso chegue na capacidade maxima, o java ira dobrar o espaço
        List<String> nomes2 = new ArrayList<>(16);
        nomes.add("Gabriel");
        nomes.add("Gabriel2");
        nomes.add("Gabriel3");
        nomes.add("Gabriel4");

//        nomes.remove(0); //ou nomes.remove("Gabriel)
        nomes.addAll(nomes2);

        for (String nome : nomes) {
            System.out.println(nome);
        }
//        nomes.add("Gabriel5");
//        System.out.println("--------------");
//        for (int i = 0; i < nomes.size(); i++) {
//            System.out.println(nomes.get(i));
//        }
    }
}
