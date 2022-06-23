package com.examplecics.demo.feign;


import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author : anisioSilva
 * @created : 13/06/2022, segunda-feira
 **/
@FeignClient(url = "https://af-logreversa-hlg.azurewebsites.net" + "/api/", name = "api-encerramento")
public interface EncerramentoClient extends EncerramentoAPI {
}
