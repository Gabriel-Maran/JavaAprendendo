package aprendendoObjetos.classesAbstratas.teste;

import aprendendoObjetos.classesAbstratas.dominio.Desenvolvedor;
import aprendendoObjetos.classesAbstratas.dominio.Funcionario;
import aprendendoObjetos.classesAbstratas.dominio.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Desenvolvedor desenvolvedor1 = new Desenvolvedor("Desenvolvedor 1", 15000);
        Gerente gerente1 = new Gerente("Gerente 1", 10000);
        System.out.println(gerente1);
        System.out.println(desenvolvedor1);
        desenvolvedor1.imprime();
        gerente1.imprime();
    }
}
