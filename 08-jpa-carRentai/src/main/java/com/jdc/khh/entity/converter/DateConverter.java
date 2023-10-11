package com.jdc.khh.entity.converter;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
@Converter
public class DateConverter implements AttributeConverter<LocalDate, Date>{

	@Override
	public Date convertToDatabaseColumn(LocalDate localdate) {
		// TODO Auto-generated method stub
		return Date.valueOf(localdate);
	}

	@Override
	public LocalDate convertToEntityAttribute(Date date) {
		// TODO Auto-generated method stub
		return date.toLocalDate();
	}
	
	

}
