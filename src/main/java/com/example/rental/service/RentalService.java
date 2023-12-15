package com.example.rental.service;

import com.example.rental.converter.RentalConverter;
import com.example.rental.dto.RentalDTORequest;
import com.example.rental.dto.RentalDTOResponse;
import com.example.rental.entity.Car;
import com.example.rental.entity.Owner;
import com.example.rental.exception.UserAlreadyExistException;
import com.example.rental.repository.CarRepo;
import com.example.rental.repository.OwnerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RentalService {

    private CarRepo carRepo;
    private OwnerRepo ownerRepo;

    @Autowired
    public RentalService(CarRepo carRepo, OwnerRepo ownerRepo) {
        this.carRepo = carRepo;
        this.ownerRepo = ownerRepo;
    }

    public RentalDTOResponse addOrUpdateOwnerAndCar(RentalDTORequest rentalDTORequest) throws UserAlreadyExistException {
        if (ownerRepo.findByName(rentalDTORequest.getName()) != null) {
            throw new UserAlreadyExistException("User with that name already exist");
        }
        Owner owner = new Owner();
        owner.setName(rentalDTORequest.getName());
        owner.setYearOfBirth(rentalDTORequest.getYearOfBirth());

        ownerRepo.save(owner);

        Car car = new Car();
        car.setBrand(rentalDTORequest.getBrand());
        car.setYearOfRelease(rentalDTORequest.getYearOfRelease());
        carRepo.save(car);

        return RentalConverter.toDTO(rentalDTORequest);
    }
}
