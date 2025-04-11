package com.gabrielmaran.aprendendojbdc.dominio;

import java.util.Objects;

public class Producer {
    private Integer id;
    private String nome;


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
            producer.nome = this.nome;
            return producer;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producer producer = (Producer) o;
        return Objects.equals(id, producer.id) && Objects.equals(nome, producer.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Producer{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
