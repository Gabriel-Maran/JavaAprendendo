package com.gabrielmaran.crudJDBC.dominio;

public class Producer {
    private Integer id;
    private String name;

    public static final class ProducerBuilder {
        private Integer id;
        private String nome;

        private ProducerBuilder() {
        }

        public static ProducerBuilder builder() {
            return new ProducerBuilder();
        }

        public ProducerBuilder id(Integer id) {
            this.id = id;
            return this;
        }

        public ProducerBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public Producer build() {
            Producer producer = new Producer();
            producer.id = this.id;
            producer.name = this.nome;
            return producer;
        }

    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}