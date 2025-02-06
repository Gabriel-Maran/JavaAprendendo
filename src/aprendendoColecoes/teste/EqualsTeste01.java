package aprendendoColecoes.teste;

import aprendendoColecoes.dominio.Smartphone;

public class EqualsTeste01 {
    public static void main(String[] args) {
        String nome = "Gabriel";
        String nome2 = new String( "Gabriel");
        System.out.println(nome == nome2);//esta sendo comparado o valor de referencia das duas Strings, por isso retorna false
        System.out.println(nome.equals(nome2));
        Smartphone s1 = new Smartphone("1ABC!1", "Iphone");
        Smartphone s2 = new Smartphone("1ABC!1", "Iphone");
        System.out.println(s1.equals(s2));
    }
}
