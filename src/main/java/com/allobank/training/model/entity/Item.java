package com.allobank.training.model.entity;

import com.allobank.training.constant.DefaultValues;
import com.allobank.training.converter.BigDecimalToBigDecimalConverter;
import com.allobank.training.converter.StringToStringConverter;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "item")
public class Item {
    @Id
    @Column(name = "id")
    @Convert(converter = StringToStringConverter.class)
    private String id = DefaultValues.EMPTY_STRING;

    @Column(name = "name")
    @Convert(converter = StringToStringConverter.class)
    private String name = DefaultValues.EMPTY_STRING;

    @Column(name = "price")
    @Convert(converter = BigDecimalToBigDecimalConverter.class)
    private BigDecimal price = BigDecimal.ZERO;
}