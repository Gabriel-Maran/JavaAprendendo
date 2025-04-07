package com.gabrielmaran.aprendendoExcecoes.exception.teste;

import com.gabrielmaran.aprendendoExcecoes.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try{
            logar();
        }catch(LoginInvalidoException e){
            e.printStackTrace();
        }

    }
    private static void logar() throws LoginInvalidoException {
        Scanner scan = new Scanner(System.in);
        String userNameDB = "Abc";
        String senhaDB = "cbA";
        System.out.println("Digite o nome do Usuário: ");
        String usernameDigitado = scan.nextLine();
        System.out.println("Digite a senha do Usuário: ");
        String passwordDigitadp = scan.nextLine();
        if(!userNameDB.equals(usernameDigitado) || !senhaDB.equals(passwordDigitadp)){
            throw new LoginInvalidoException("Usuário ou senha invalidos");
        }

        System.out.println("Usuário logado com sucesso!");
    }
}

