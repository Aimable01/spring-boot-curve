package com.Aimable01.json;

import com.Aimable01.json.domain.Book;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class JackstonTests {

    @Test
    public void testThatObjectMapperCanCreateJsonFromJavaObject() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Book book = Book.builder()
                .isbn("123-456-789")
                .title("The River Between")
                .author("Chinua Achebe")
                .yearPublished("2005")
                .build();

        String result = objectMapper.writeValueAsString(book);
        assertThat(result).isEqualTo("{\"isbn\":\"123-456-789\",\"title\":\"The River Between\",\"author\":\"Chinua Achebe\",\"year\":\"2005\"}");
    }

    @Test
    public void testThatObjectMapperCanCreateObjectFromJavaObject() throws JsonProcessingException {
        String json = "{\"foo\":\"bar\",\"isbn\":\"123-456-789\",\"title\":\"The River Between\",\"author\":\"Chinua Achebe\",\"year\":\"2005\"}";
        ObjectMapper objectMapper = new ObjectMapper();

        Book result = objectMapper.readValue(json, Book.class);
        Book book = Book.builder()
                .isbn("123-456-789")
                .title("The River Between")
                .author("Chinua Achebe")
                .yearPublished("2005")
                .build();

        assertThat(result).isEqualTo(book);
    }
}
