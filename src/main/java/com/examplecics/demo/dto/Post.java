package com.examplecics.demo.dto;

/**
 * @author : anisioSilva
 * @created : 13/06/2022, segunda-feira
 **/
import lombok.Value;

@Value
public class Post {

    Long id;
    Long userId;
    String title;
    String body;
}
