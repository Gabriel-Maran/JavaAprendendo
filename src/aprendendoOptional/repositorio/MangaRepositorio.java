package aprendendoOptional.repositorio;

import aprendendoOptional.dominio.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class MangaRepositorio {
    private static  List<Manga> mangas = List.of(new Manga(1, "One Piece", 1101), new Manga(2, "Naruto", 500), new Manga(3, "Solo Leveling", 300));

    public static Optional<Manga> buscarMangaPorId(Integer id) {
        return fidnBy(m -> m.getId().equals(id));
    }

    public static Optional<Manga> buscarMangaPorTitulo(String titulo){
        return fidnBy(m -> m.getTitulo().equals(titulo));
    }

    private static Optional<Manga> fidnBy(Predicate<Manga> predicate){
        Manga found = null;
        for(Manga manga : mangas){
            if(predicate.test(manga)){
                found = manga;
            }
        }
        return Optional.ofNullable(found);
    }
}