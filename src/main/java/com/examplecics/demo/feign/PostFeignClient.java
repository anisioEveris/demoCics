package com.examplecics.demo.feign;

import com.examplecics.demo.dto.Post;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author : anisioSilva
 * @created : 13/06/2022, segunda-feira
 **/
@FeignClient(name = "postFeignClient", url = "https://jsonplaceholder.typicode.com")
public interface PostFeignClient {
    @GetMapping("/posts")
    List<Post> getAllPosts();
}
