package com.gabrielmaran.aprendendoClassesUtilitarias.datas.teste;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DatasTeste01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Digite sua data de nascimento: (dd/MM/yyyy)");
            String data = sc.nextLine();
            DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dataAniversario = LocalDate.parse(data, formatador);
            System.out.println("O aniversario é: " + dataAniversario);
        }catch (DateTimeParseException e){
            e.printStackTrace();
        }
    }
}
