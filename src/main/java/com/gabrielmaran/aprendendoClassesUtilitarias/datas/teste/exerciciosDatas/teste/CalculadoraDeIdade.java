package com.gabrielmaran.aprendendoClassesUtilitarias.datas.teste.exerciciosDatas.teste;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CalculadoraDeIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua data de nacimento (dd/MM/yyyy) ");
        String data = sc.nextLine();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataAniver = LocalDate.parse(data, formatador);
        LocalDate hoje = LocalDate.now();
        Period idade = Period.between(hoje, dataAniver);
        System.out.println("Ano(s): " + idade.getYears() + ", mes(es)"+ idade.getMonths() + "dia(s)"+ idade.getDays());
    }
}
