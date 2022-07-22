package com.tebr5923.converter;

import com.tebr5923.domain.Dimensions;

import javax.persistence.AttributeConverter;

public class DimensionsConverter implements AttributeConverter<Dimensions, String> {
    @Override
    public String convertToDatabaseColumn(Dimensions dimensions) {
        return String.format("%sX%sX%s", dimensions.getX(), dimensions.getY(), dimensions.getZ());
    }

    @Override
    public Dimensions convertToEntityAttribute(String s) {
        String[] xyz = s.split("X");
        return new Dimensions(
                Integer.parseInt(xyz[0])
                ,Integer.parseInt(xyz[0])
                ,Integer.parseInt(xyz[0]));
    }
}
