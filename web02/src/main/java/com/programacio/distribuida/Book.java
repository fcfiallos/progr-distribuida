package com.programacio.distribuida;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Book {
    private String title;
    private String isbn;
}
