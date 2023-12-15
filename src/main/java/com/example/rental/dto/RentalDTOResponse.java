package com.example.rental.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class RentalDTOResponse {

    private String name;
    private String brand;
    private Integer yearOfRelease;
}
