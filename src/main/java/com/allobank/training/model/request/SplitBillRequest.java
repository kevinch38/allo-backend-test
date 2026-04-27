package com.allobank.training.model.request;

import com.allobank.training.constant.DefaultValues;
import com.allobank.training.dto.ParticipantDto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class SplitBillRequest {
    private String lenderId = DefaultValues.EMPTY_STRING;
    private String shopId = DefaultValues.EMPTY_STRING;
    private BigDecimal adminFee = BigDecimal.ZERO;
    private BigDecimal deliveryFee = BigDecimal.ZERO;
    private BigDecimal discount = BigDecimal.ZERO;
    private List<ParticipantDto> participants = new ArrayList<>();
    private String splitType = DefaultValues.EMPTY_STRING;
}
