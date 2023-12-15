package com.example.rental.converter;

import com.example.rental.dto.RentalDTORequest;
import com.example.rental.dto.RentalDTOResponse;

public class RentalConverter {

    public static RentalDTOResponse toDTO(RentalDTORequest rentalDTORequest) {
        return RentalDTOResponse.builder()
                .name(rentalDTORequest.getName())
                .brand(rentalDTORequest.getBrand())
                .yearOfRelease(rentalDTORequest.getYearOfRelease())
                .build();
    }
}
