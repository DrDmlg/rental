package com.example.rental.service;

import com.example.rental.converter.OwnerConverter;
import com.example.rental.dto.OwnerDTOResponse;
import com.example.rental.entity.Owner;
import com.example.rental.exception.UserAlreadyExistException;
import com.example.rental.repository.OwnerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OwnerService {

    private OwnerRepo ownerRepo;

    @Autowired
    public OwnerService(OwnerRepo ownerRepo) {
        this.ownerRepo = ownerRepo;
    }

}
