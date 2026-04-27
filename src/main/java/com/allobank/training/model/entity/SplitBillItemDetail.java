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
@Table(name = "split_bill_item_detail")
public class SplitBillItemDetail {
    @Id
    @Column(name = "id")
    @Convert(converter = StringToStringConverter.class)
    private String id = DefaultValues.EMPTY_STRING;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item = new Item();

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user = new User();

    @Column(name = "split_bill_detail_transaction_id")
    @Convert(converter = StringToStringConverter.class)
    private String splitBillDetailTransactionId = DefaultValues.EMPTY_STRING;

    @Column(name = "shop_id")
    @Convert(converter = StringToStringConverter.class)
    private String shopId = DefaultValues.EMPTY_STRING;

    @Column(name = "quantity")
    @Convert(converter = BigDecimalToBigDecimalConverter.class)
    private BigDecimal quantity = BigDecimal.ZERO;

    @Column(name = "original_price")
    @Convert(converter = BigDecimalToBigDecimalConverter.class)
    private BigDecimal originalPrice = BigDecimal.ZERO;

    @Column(name = "final_price")
    @Convert(converter = BigDecimalToBigDecimalConverter.class)
    private BigDecimal finalPrice = BigDecimal.ZERO;

    @Column(name = "status")
    @Convert(converter = StringToStringConverter.class)
    private String status = DefaultValues.EMPTY_STRING;
}