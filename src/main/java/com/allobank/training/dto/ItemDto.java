package com.allobank.training.dto;

import com.allobank.training.constant.DefaultValues;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemDto {
    private String id = DefaultValues.EMPTY_STRING;
    private BigDecimal quantity = BigDecimal.ZERO;
}
