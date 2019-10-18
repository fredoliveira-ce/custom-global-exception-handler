package com.fredoliveira.customglobalexceptionhandler.app.web;

import com.fredoliveira.customglobalexceptionhandler.domain.Animal;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.Valid;

@RestControllerAdvice
@RequestMapping("api/animal")
public class RestController {

    @PostMapping
    public ResponseEntity<String> save(@Valid @RequestBody Animal animal) {
        return ResponseEntity.ok().body(animal.getName());
    }

}
