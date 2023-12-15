package com.example.rental.repository;

import com.example.rental.entity.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepo extends JpaRepository<Owner, Long> {

    Owner findByName(String name);
}
