package com.validation;

import java.sql.Date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.validation.ConstraintValidator;

import javax.validation.ConstraintValidatorContext;

public class DateConstraintValidator implements ConstraintValidator<Datev, Date> {
    public boolean isValid(Date inpd, ConstraintValidatorContext cvc) {
    	try {
    	DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date date = new java.util.Date();
		String d1[]=dateFormat.format(date).split("-");
		String d[]=inpd.toString().split("-");
		if(!(d1[0].equals(d[0]) && d1[1].equals(d[1]) && d1[2].equals(d[2]))) {
			return false;
		}
		return true;
    	}
		catch(Exception e) {
			return false;
		}
    }

	
}
