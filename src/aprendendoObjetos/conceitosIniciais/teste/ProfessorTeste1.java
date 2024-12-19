package aprendendoObjetos.conceitosIniciais.teste;

import aprendendoObjetos.conceitosIniciais.dominio.Professor;

public class ProfessorTeste1 {
    public static void main(String[] args) {
        Professor Joao = new Professor();
        Joao.nome = "João";
        Joao.idade = 36;
        Joao.sexo = 'M';
        System.out.println("Aqui estão algumas informações do professor " + Joao.nome + ": ele tem " + Joao.idade + " e é do sexo " + Joao.sexo);
    }
}
