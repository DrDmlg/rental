package com.example.rental.converter;

import com.example.rental.dto.OwnerDTOResponse;
import com.example.rental.entity.Owner;

public class OwnerConverter {

    public static OwnerDTOResponse toDTO(Owner ownerEntity) {
        return OwnerDTOResponse.builder()
                .name(ownerEntity.getName())
                .yearOfBirth(ownerEntity.getYearOfBirth())
                .build();
    }
}
