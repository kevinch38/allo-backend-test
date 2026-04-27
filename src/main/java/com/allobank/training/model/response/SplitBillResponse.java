package com.allobank.training.model.response;

import com.allobank.training.constant.DefaultValues;
import com.allobank.training.dto.OrderDetailDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SplitBillResponse {
    private OrderDetailDto lenderOrder = new OrderDetailDto();
    private List<OrderDetailDto> participantOrders = new ArrayList<>();
    private String status = DefaultValues.EMPTY_STRING;
}
