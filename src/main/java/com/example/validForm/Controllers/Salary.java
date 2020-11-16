package com.example.validForm.Controllers;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = SalaryValidator.class)
public @interface Salary {

    String message() default "Nie odpowiednia pensja";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}




