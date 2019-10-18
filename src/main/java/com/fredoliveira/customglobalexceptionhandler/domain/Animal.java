package com.fredoliveira.customglobalexceptionhandler.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Animal {

    @NotNull
    @NotBlank
    @Pattern(regexp = "^[A-Z]+$", flags = Pattern.Flag.CASE_INSENSITIVE, message = "deve conter apenas letras.")
    private String name;

    @Min(2)
    @Max(10)
    private Integer age;

    @Size(min = 5, max = 10)
    private String type;

    @Valid
    @NotNull
    private OwnerAnimal ownerAnimal;

}
