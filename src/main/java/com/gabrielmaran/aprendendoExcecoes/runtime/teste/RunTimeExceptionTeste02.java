package com.gabrielmaran.aprendendoExcecoes.runtime.teste;

public class RunTimeExceptionTeste02 {
    public static void main(String[] args) {
        Integer num1 = 6;
        Integer num2 = 2;
        try{
            divisao(num1, num2); //Ctrl + Q
        }catch(RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("O resultado da divisão é: "+divisao(num1,num2));
    }



    /**
     *
     * @param a
     * @param b não pode ser zero
     * @return
     * @throws IllegalArgumentException caso b seja 0
     */
    public static int divisao(int a, int b) throws IllegalArgumentException {
        // "throws IllegalArgumentException diz para quem for utilizar o codigo que pode ser que de erro
        // e que precisa ser tratada anteriormente, caso não seja no codigo
        if(b == 0){
            throw new IllegalArgumentException("Argumento ilegal, não pode ser zero"); //Throw lança uma nova exceção
        }
            return a / b;
    }
}

