package aprendendoClassesUtilitarias.string.teste;

public class StringTeste01 {
    public static void main(String[] args) {
        String nome = "Gabriel"; //String constant pool, Strings são imutáveis
        String nome2 = "Gabriel";
        nome.concat(" Maran"); //Não é possivel trocar o valor de uma String sem uma nova associação
        System.out.println(nome);
        System.out.println(nome == nome2); //o "==" nessa situação compara o valor de referencias das duas Strings
        String nome3 = new String("Gabriel") ; //Está sendo criada dentro do heap um objeto tipo String, fora do pool String, sendo referencias diferentes
        System.out.println(nome == nome3);
        System.out.println(nome == nome3.intern());//Está pegando a referencia dentro do pool de String com o "intern"
    }
}
