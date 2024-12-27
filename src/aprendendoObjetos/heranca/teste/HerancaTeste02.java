package aprendendoObjetos.heranca.teste;

import aprendendoObjetos.heranca.dominio.Funcionario;

public class HerancaTeste02 {
    //Ordem seguida:
    //0- Bloco de inicialização estático da super classe é executado quando a JVM carregar a classe pai
    //1- Bloco de inicialização estático da sub classe é executado quando a JVM carregar a classe filha
    //2- É alocado em espaço de memoria o objeto da super classe
    //3- Cada atributo de super classe é criado com um valor default ou outro o que foi passado da classe pai
    //4- Bloco de inicialização da super classe é executado na ordem que aparece
    //5- Contrutor da super classe  é executado
    //6- É alocado em espaço de memoria o objeto da sub classe
    //7- Cada atributo de sub classe é criado com um valor default ou outro o que foi passado da classe pai
    //8- Bloco de inicialização da sub classe é executado na ordem que aparece
    //9- Contrutor da sub classe  é executado


    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Carlos");
    }
}
