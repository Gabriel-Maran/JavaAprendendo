package aprendendoObjetos.conceitosIniciais.teste;

import aprendendoObjetos.conceitosIniciais.dominio.Estudante;

public class EstudanteTeste1 {
    public static void main(String[] args) {
        Estudante Carlos = new Estudante();
        Carlos.nome = "Carlos";
        Carlos.idade = 20;
        Carlos.sexo = 'M';
        System.out.println("Aqui estão algumas informações sobre "+Carlos.nome+": ele tem "+Carlos.idade+" anos e é do sexo "+Carlos.sexo);
    }
}
