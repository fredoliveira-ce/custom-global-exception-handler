package com.fredoliveira.customglobalexceptionhandler.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OwnerAnimal {

    @NotBlank
    @NotNull
    private String address;

}
