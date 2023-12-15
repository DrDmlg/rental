package com.example.rental.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class OwnerDTOResponse {

    private String name;
    private Integer yearOfBirth;
}
