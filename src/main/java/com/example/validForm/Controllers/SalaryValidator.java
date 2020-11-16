package com.example.validForm.Controllers;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class SalaryValidator implements ConstraintValidator<Salary, Double> {
    @Override
    public void initialize(Salary constraintAnnotation) {

    }

    @Override
    public boolean isValid(Double v, ConstraintValidatorContext constraintValidatorContext) {
        return v >= 2000 && v <= 3000;
    }
}
