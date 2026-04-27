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
@Table(name = "split_bill_transaction")
public class SplitBillTransaction {
    @Id
    @Column(name = "id")
    @Convert(converter = StringToStringConverter.class)
    private String id = DefaultValues.EMPTY_STRING;

    @OneToOne
    @JoinColumn(name = "lender_id")
    private User lender = new User();

    @OneToOne
    @JoinColumn(name = "shop_id")
    private Shop shop = new Shop();

    @OneToOne
    @JoinColumn(name = "participant_id")
    private User participant = new User();

    @Column(name = "total")
    @Convert(converter = BigDecimalToBigDecimalConverter.class)
    private BigDecimal total = BigDecimal.ZERO;

    @Column(name = "splitType")
    @Convert(converter = StringToStringConverter.class)
    private String splitType = DefaultValues.EMPTY_STRING;

    @Column(name = "created_time")
    @Convert(converter = StringToStringConverter.class)
    private String createdTime = DefaultValues.EMPTY_STRING;

    @Column(name = "created_by")
    @Convert(converter = StringToStringConverter.class)
    private String createdBy = DefaultValues.EMPTY_STRING;
}