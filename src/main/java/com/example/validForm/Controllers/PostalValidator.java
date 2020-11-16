package com.example.validForm.Controllers;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PostalValidator implements ConstraintValidator<Postal, String> {
    public void initialize(Postal constraint) {
    }

    @Override
    public boolean isValid(String postal, ConstraintValidatorContext constraintValidatorContext) {
        final String regexp = "[0-9]{2}-[0-9]{3}";
        return postal.matches(regexp);
    }
}