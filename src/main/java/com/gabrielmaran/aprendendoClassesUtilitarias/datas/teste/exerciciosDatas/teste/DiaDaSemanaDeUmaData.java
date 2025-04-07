package com.gabrielmaran.aprendendoClassesUtilitarias.datas.teste.exerciciosDatas.teste;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DiaDaSemanaDeUmaData {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite uma data (dd/MM/yyyy)");
        String data = sc.nextLine();
        DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataFormatada = LocalDate.parse(data,formatacao);
        System.out.println("Dia da semana:  \n"+  dataFormatada.getDayOfWeek());
        System.out.println("Dia:  \n"+  data);
    }
}
