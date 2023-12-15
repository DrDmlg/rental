package com.example.rental.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString

public class RentalDTORequest {

    private String name;
    private Integer yearOfBirth;
    private String brand;
    private Integer yearOfRelease;
}
