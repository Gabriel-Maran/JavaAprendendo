package com.gabrielmaran.aprendendoPadroesDeProjeto.dominio;

public class ReportDto {
    private Aircraft aircraft;
    private Country country;
    private Currency currency;
    private Person person;



    @Override
    public String toString() {
        return "ReportDto{\n" +
                " aircraftname=" + aircraft +
                "\n country=" + country +
                "\n currency=" + currency +
                "\n person=" + person +
                "\n}";
    }

    public static final class ReportDtoBuilder {
        private Aircraft aircraft;
        private Country country;
        private Currency currency;
        private Person person;

        private ReportDtoBuilder() {
        }

        public static ReportDtoBuilder builder() {
            return new ReportDtoBuilder();
        }

        public ReportDtoBuilder aircraft(Aircraft aircraft) {
            this.aircraft = aircraft;
            return this;
        }

        public ReportDtoBuilder country(Country country) {
            this.country = country;
            return this;
        }

        public ReportDtoBuilder currency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public ReportDtoBuilder person(Person person) {
            this.person = person;
            return this;
        }

        public ReportDto build() {
            ReportDto reportDto = new ReportDto();
            reportDto.person = this.person;
            reportDto.country = this.country;
            reportDto.currency = this.currency;
            reportDto.aircraft = this.aircraft;
            return reportDto;
        }
    }
}