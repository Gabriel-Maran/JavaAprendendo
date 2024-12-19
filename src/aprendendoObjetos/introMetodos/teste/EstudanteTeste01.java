package aprendendoObjetos.introMetodos.teste;

import aprendendoObjetos.introMetodos.dominio.Estudante;
import aprendendoObjetos.introMetodos.dominio.ImprimeEstudantes;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImprimeEstudantes imprimeEstu = new ImprimeEstudantes();
        estudante1.nome = "Joao";
        estudante1.idade = 18;
        estudante1.sexo = 'M';

        estudante2.nome = "Maria";
        estudante2.idade = 20;
        estudante2.sexo = 'F';
        System.out.println(estudante1.nome);
        System.out.println(estudante2.nome);
        System.out.println("---------------------");
        imprimeEstu.impressora(estudante1);
        imprimeEstu.impressora(estudante2);
        imprimeEstu.impressora(estudante1);
        imprimeEstu.impressora(estudante2);
        System.out.println(estudante1.nome);
        System.out.println(estudante2.nome);
    }
}
