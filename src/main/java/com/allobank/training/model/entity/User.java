package com.allobank.training.model.entity;

import com.allobank.training.constant.DefaultValues;
import com.allobank.training.converter.BigDecimalToBigDecimalConverter;
import com.allobank.training.converter.StringToStringConverter;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "id")
    @Convert(converter = StringToStringConverter.class)
    private String id = DefaultValues.EMPTY_STRING;

    @Column(name = "name")
    @Convert(converter = StringToStringConverter.class)
    private String name = DefaultValues.EMPTY_STRING;

    @Column(name = "balance")
    @Convert(converter = BigDecimalToBigDecimalConverter.class)
    private BigDecimal balance = BigDecimal.ZERO;
}