package aprendendoObjetos.classesAbstratas.exercicio.teste;

import aprendendoObjetos.classesAbstratas.exercicio.dominio.*;

import java.util.ArrayList;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Mensalista mensalista1 = new Mensalista("João", 4500);
        Comissionado comissionado1 = new Comissionado("Cleiton", 2500, 20000);
        Horista horista1 = new Horista("Carlos", 250, 16);
        FolhaPagamento folhaPagamento = new FolhaPagamento();
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(mensalista1);
        funcionarios.add(comissionado1);
        funcionarios.add(horista1);
        folhaPagamento.imprimirFolha(funcionarios);

    }
}
