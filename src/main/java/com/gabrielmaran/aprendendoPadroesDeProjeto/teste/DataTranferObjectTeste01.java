package com.gabrielmaran.aprendendoPadroesDeProjeto.teste;

import com.gabrielmaran.aprendendoPadroesDeProjeto.dominio.*;

public class DataTranferObjectTeste01 {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("nome");
        Country country = Country.BRAZIL;
        Currency currency = MoedaCurrencyFactory.newCurrency(country);
        Person person = Person.PersonBuilder.builder()
                .firstName("SeiLa")
                .lastName("EuSei")
                .username("Sim")
                .email("sim@sim.com")
                .build();
        ReportDto reportDtoBuilder = ReportDto.ReportDtoBuilder.builder()
                .aircraft(aircraft)
                .country(country)
                .currency(currency)
                .person(person)
                .build();
        System.out.println(reportDtoBuilder);
    }
}
