package exercicios.exs01;

import java.util.Iterator;

public class NumeroArmstrong {
    public static void main(String[] args) {
        int numBase = 9474;
        int num = numBase;
        int digits = String.valueOf(num).length();
        int number;
        int sum = 0;
        for (int i = 0; i < digits; i++) {
            number = num % 10;
            num = num/10;
            sum = (int) (sum + (Math.pow(number, digits)));
        }
        if(sum == numBase){
            System.out.printf("O numero %d é um número Armstrong%n", numBase);
        }else {
            System.out.printf("O número %d não é um número Armstrong%n", numBase);
        }
    }
}
