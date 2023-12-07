package com.example.API.Repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


import com.example.API.entity.Property;

@Repository


    public interface PropertyRepository extends JpaRepository<Property,Integer> {
    }
    
