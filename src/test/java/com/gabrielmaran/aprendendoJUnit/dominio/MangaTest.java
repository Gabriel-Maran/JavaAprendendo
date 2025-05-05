package com.gabrielmaran.aprendendoJUnit.dominio;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MangaTest {
    private Manga manga1;
    private Manga manga2;

    @BeforeEach
    public void setUp() {
        manga1 = new Manga("Kimetsu no Yaiba", 48);
        manga2 = new Manga("Kimetsu no Yaiba", 48);
    }

    @Test
    public void accessors_ReturnData_WhenInitialized() {
        Assertions.assertEquals("Kimetsu no Yaiba", manga1.name());
        Assertions.assertEquals(48, manga1.episodes());
    }

    @Test
    public void equals_ReturnTrue_WhenObjectsAreEqual() {
        Assertions.assertEquals(manga1, manga2);
    }

    @Test
    public void hashCode_ReturnTrue_WhenObjectsAreEqual() {
        Assertions.assertEquals(manga1.hashCode(), manga1.hashCode());
    }

    @Test
    public void contructor_ThrowNullPointerException_WhenObjectIsNull() {
        Assertions.assertThrows(NullPointerException.class,
                () -> new Manga(null, 12));
    }

    @Test
    public void isRecord_ReturnTrue_WhenClassIsRecord() {
        Assertions.assertTrue(Manga.class.isRecord());
    }
}