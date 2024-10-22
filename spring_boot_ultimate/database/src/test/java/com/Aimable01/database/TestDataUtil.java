package com.Aimable01.database;

import com.Aimable01.database.domain.Author;
import com.Aimable01.database.domain.Book;

public final class TestDataUtil {

    private TestDataUtil() {}

    public static Author createTestAuthor() {
        return Author.builder()
                .id(1L)
                .name("Abigail Rose")
                .age(80)
                .build();
    }

    public static Book createTestBook() {
        return Book.builder()
                .isbn("123-456-789")
                .title("The Shadow in the Attic")
                .authorId(1L)
                .build();
    }
}
