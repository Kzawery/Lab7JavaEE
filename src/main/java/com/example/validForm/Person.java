package com.example.validForm;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.*;

@Data
public class Person {
    @NotNull(message = "Name is required")
    @Size(min = 2, message = "Name should be start at least two characters")
    private String name;

    @NotNull(message = "Age is required")
    @Min(value = 0, message = "Age must be at least zero")
    private int age;

    @NotNull(message = "Postal code is required")
    @Pattern(regexp = "[0-9]{2}-[0-9]{3}", message = "Postal code must be in format: XX-XXX")
    private String postal;

    @NotNull(message = "Salary is required")
    @DecimalMin(value= "2000.00", message = "Minimal earnings cannot be below 2000")
    @DecimalMax(value= "3000.00", message = "Maximal earnings cannot be above 3000")
    private double salary;
    @NotNull(message = "Accept is required")
    @AssertTrue(message = "You need to accept terms")
    private boolean accept;
}
