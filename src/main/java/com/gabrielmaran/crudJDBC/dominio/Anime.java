package com.gabrielmaran.crudJDBC.dominio;

public class Anime {
    private int idAnime;
    private String name;
    private int episodes;
    private Producer producer;

    public static final class AnimeBuilder {
        private int idAnime;
        private String name;
        private int episodes;
        private Producer producer;

        private AnimeBuilder() {
        }

        public static AnimeBuilder builder() {
            return new AnimeBuilder();
        }

        public AnimeBuilder setIdAnime(int idAnime) {
            this.idAnime = idAnime;
            return this;
        }

        public AnimeBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public AnimeBuilder setEpisodes(int episodes) {
            this.episodes = episodes;
            return this;
        }

        public AnimeBuilder setProducer(Producer producer) {
            this.producer = producer;
            return this;
        }

        public Anime build() {
            Anime anime = new Anime();
            anime.idAnime = this.idAnime;
            anime.name = this.name;
            anime.episodes = this.episodes;
            anime.producer = this.producer;
            return anime;
        }
    }

    @Override
    public String toString() {
        return "Anime{" + "idAnime=" + idAnime + ", name='" + name + ", episodes=" + episodes + ", producer=" + producer + '}';
    }

    public int getIdAnime() {
        return idAnime;
    }

    public String getName() {
        return name;
    }

    public int getEpisodes() {
        return episodes;
    }

    public Producer getProducer() {
        return producer;
    }
}
