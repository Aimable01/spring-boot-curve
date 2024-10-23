package com.Aimable01.database;

import com.Aimable01.database.domain.Author;
import com.Aimable01.database.domain.Book;

public final class TestDataUtil {

    private TestDataUtil() {}

    public static Author createTestAuthorA() {
        return Author.builder()
                .id(1L)
                .name("Abigail Rose")
                .age(80)
                .build();
    }

    public static Author createTestAuthorB() {
        return Author.builder()
                .id(2L)
                .name("kwizera")
                .age(80)
                .build();
    }

    public static Author createTestAuthorC() {
        return Author.builder()
                .id(3L)
                .name("aiamble")
                .age(80)
                .build();
    }

    public static Book createTestBookA() {
        return Book.builder()
                .isbn("123-456-789")
                .title("The Shadow in the Attic")
                .authorId(1L)
                .build();
    }

    public static Book createTestBookB() {
        return Book.builder()
                .isbn("223-456-789")
                .title("The Shadow in the Attic")
                .authorId(1L)
                .build();
    }

    public static Book createTestBookC() {
        return Book.builder()
                .isbn("323-456-789")
                .title("The Shadow in the Attic")
                .authorId(1L)
                .build();
    }
}
