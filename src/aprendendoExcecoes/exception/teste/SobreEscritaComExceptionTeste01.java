package aprendendoExcecoes.exception.teste;

import aprendendoExcecoes.exception.dominio.Funcionario;
import aprendendoExcecoes.exception.dominio.LoginInvalidoException;
import aprendendoExcecoes.exception.dominio.Pessoa;


public class SobreEscritaComExceptionTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();
        try{
            funcionario.salvar();
        }catch(LoginInvalidoException e ){
            e.printStackTrace();
        }
    }
}
