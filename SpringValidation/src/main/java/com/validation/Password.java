package com.validation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
@Constraint(validatedBy = PasswordConstraintValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD } )
@Retention(RetentionPolicy.RUNTIME)
public @interface Password {
    //error message
        public String message() default "must contain virtusa";
    //represents group of constraints    
        public Class<?>[] groups() default {};
    //represents additional information about annotation
        public Class<? extends Payload>[] payload() default {};
}