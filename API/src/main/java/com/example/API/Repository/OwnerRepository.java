package com.example.API.Repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.API.entity.Owner;

@Repository


    public interface OwnerRepository extends JpaRepository<Owner,Integer> {
    }
    