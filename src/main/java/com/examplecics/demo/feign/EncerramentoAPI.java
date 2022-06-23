package com.examplecics.demo.feign;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author : anisioSilva
 * @created : 13/06/2022, segunda-feira
 **/
public interface EncerramentoAPI {
    @GetMapping(value = "/teste")
    String teste();

}
