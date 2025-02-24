package aprendendoOptional.dominio;

public class Manga {
    private Integer id;
    private String titulo;
    private int chapters;

    public Manga(Integer id, String titulo, int chapters) {
        this.id = id;
        this.titulo = titulo;
        this.chapters = chapters;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", chapters=" + chapters +
                '}';
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setChapters(int chapters) {
        this.chapters = chapters;
    }

    public Integer getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getChapters() {
        return chapters;
    }
}

