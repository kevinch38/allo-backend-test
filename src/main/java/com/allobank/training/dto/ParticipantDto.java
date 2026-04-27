package com.allobank.training.dto;

import com.allobank.training.constant.DefaultValues;
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
public class ParticipantDto {
    private String participantId = DefaultValues.EMPTY_STRING;
    private List<ItemDto> items = new ArrayList<>();
}
