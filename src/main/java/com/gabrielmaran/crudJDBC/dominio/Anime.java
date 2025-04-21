package com.gabrielmaran.crudJDBC.dominio;

public class Anime {
    private Integer idAnime;
    private String name;
    private Integer episodes;
    private Producer producer;

    public static final class AnimeBuilder {
        private Integer idAnime;
        private String name;
        private Integer episodes;
        private Producer producer;

        private AnimeBuilder() {
        }

        public static AnimeBuilder builder() {
            return new AnimeBuilder();
        }

        public AnimeBuilder setIdAnime(Integer idAnime) {
            this.idAnime = idAnime;
            return this;
        }

        public AnimeBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public AnimeBuilder setEpisodes(Integer episodes) {
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
}
