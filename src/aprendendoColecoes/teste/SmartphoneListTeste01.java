package aprendendoColecoes.teste;

import aprendendoColecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTeste01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("11111", "Iphone");
        Smartphone s2 = new Smartphone("22222", "Pixel");
        Smartphone s3 = new Smartphone("33333", "Samsung");
        List<Smartphone> smartphones = new ArrayList<>(8);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);
        smartphones.add(0,s3);
//        smartphones.clear(); //limpa o ArrayList inteiro
        for(Smartphone smartphone : smartphones) {
            System.out.println(smartphone.toString());
        }
        Smartphone s4 = new Smartphone("22223", "Pixel");
        System.out.println(smartphones.contains(s4));
        int indexSmartphone4 = smartphones.indexOf(s4);
        System.out.println(indexSmartphone4);//retorna o indicie a qual pertence o item procurado
        System.out.println(smartphones.get(indexSmartphone4));
    }
}
