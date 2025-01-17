package aprendendoClassesUtilitarias.datas.teste.exerciciosDatas.teste;

import aprendendoClassesUtilitarias.formatacao.teste.DateTimeFormatterTeste01;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DiasEntreDatas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma data (dd/MM/yyyy):");
        String data1 = sc.nextLine();
        System.out.println("Digite outra data (dd/MM/yyyy):");
        String data2 = sc.nextLine();
        DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataF1 = LocalDate.parse(data1, formatacao);
        LocalDate dataF2 = LocalDate.parse(data2, formatacao);
        Period periodoDatas = Period.between(dataF1, dataF2);
        System.out.println("Tempo entre as duas datas: ");
        System.out.println("Ano(s): " + periodoDatas.getYears());
        System.out.println("Mes(es): " + periodoDatas.getMonths());
        System.out.println("Dia(s): " + periodoDatas.getDays());
    }
}
