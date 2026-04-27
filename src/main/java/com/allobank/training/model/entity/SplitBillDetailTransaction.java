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
@Table(name = "split_bill_detail_transaction")
public class SplitBillDetailTransaction {
    @Id
    @Column(name = "id")
    @Convert(converter = StringToStringConverter.class)
    private String id = DefaultValues.EMPTY_STRING;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User participant = new User();

    @Column(name = "original_admin_fee")
    @Convert(converter = BigDecimalToBigDecimalConverter.class)
    private BigDecimal originalAdminFee = BigDecimal.ZERO;

    @Column(name = "final_admin_fee")
    @Convert(converter = BigDecimalToBigDecimalConverter.class)
    private BigDecimal finalAdminFee = BigDecimal.ZERO;

    @Column(name = "original_delivery_fee")
    @Convert(converter = BigDecimalToBigDecimalConverter.class)
    private BigDecimal originalDeliveryFee = BigDecimal.ZERO;

    @Column(name = "final_delivery_fee")
    @Convert(converter = BigDecimalToBigDecimalConverter.class)
    private BigDecimal finalDeliveryFee = BigDecimal.ZERO;

    @Column(name = "discount")
    @Convert(converter = BigDecimalToBigDecimalConverter.class)
    private BigDecimal discount = BigDecimal.ZERO;

    @Column(name = "total")
    @Convert(converter = BigDecimalToBigDecimalConverter.class)
    private BigDecimal total = BigDecimal.ZERO;

    @Column(name = "status")
    @Convert(converter = StringToStringConverter.class)
    private String status = DefaultValues.EMPTY_STRING;
}