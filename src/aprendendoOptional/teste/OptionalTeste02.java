package aprendendoOptional.teste;

import aprendendoOptional.dominio.Manga;
import aprendendoOptional.repositorio.MangaRepositorio;

import java.util.Optional;

public class OptionalTeste02 {
    public static void main(String[] args) {
       Optional<Manga> mangaByTitle = MangaRepositorio.buscarMangaPorTitulo("Solo Leveling");
       mangaByTitle.ifPresent(m -> m.setTitulo("Solo Leveling 2"));
       System.out.println(mangaByTitle);

        Manga mangaById = MangaRepositorio.buscarMangaPorId(2).orElseThrow(IllegalArgumentException::new);
        System.out.println(mangaById);

        Manga newManga = MangaRepositorio.buscarMangaPorTitulo("Dragon Ball").orElseGet(() -> new Manga(4, "Dragon Ball", 300));
        System.out.println(newManga);

    }
}
