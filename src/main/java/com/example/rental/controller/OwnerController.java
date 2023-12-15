package com.example.rental.controller;

import com.example.rental.dto.RentalDTORequest;
import com.example.rental.exception.UserAlreadyExistException;
import com.example.rental.service.CarService;
import com.example.rental.service.OwnerService;
import com.example.rental.service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/owners")
public class OwnerController {

    private final OwnerService ownerService;
    private final CarService carService;
    private final RentalService rentalService;

    @Autowired
    public OwnerController(OwnerService ownerService, CarService carService, RentalService rentalService) {
        this.ownerService = ownerService;
        this.carService = carService;
        this.rentalService = rentalService;
    }

    @PostMapping
    public ResponseEntity addOrUpdateOwnerAndCar(@RequestBody RentalDTORequest rentalDTORequest) {
        try {
            rentalService.addOrUpdateOwnerAndCar(rentalDTORequest);
            return ResponseEntity.ok(String.format("The user %s has been successfully saved", rentalDTORequest.getName()));
        } catch (UserAlreadyExistException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error!");
        }
    }
}
