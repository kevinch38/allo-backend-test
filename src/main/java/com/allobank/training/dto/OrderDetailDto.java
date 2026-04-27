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
public class OrderDetailDto {
    private String userName = DefaultValues.EMPTY_STRING;
    private String itemName = DefaultValues.EMPTY_STRING;
    private String status = DefaultValues.EMPTY_STRING;
    private BigDecimal originalPrice = BigDecimal.ZERO;
    private BigDecimal finalPrice = BigDecimal.ZERO;
    private BigDecimal originalAdminFee = BigDecimal.ZERO;
    private BigDecimal finalAdminFee = BigDecimal.ZERO;
    private BigDecimal originalDeliveryFee = BigDecimal.ZERO;
    private BigDecimal finalDeliveryFee = BigDecimal.ZERO;
    private BigDecimal quantity = BigDecimal.ZERO;
}
