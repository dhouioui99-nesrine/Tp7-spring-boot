package com.example.API.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.API.entity.Owner;

@Service

public interface OwnerService {
void save(Owner Owner);
List<Owner> getAll();
Owner getById(Integer id);
void delete(Owner Owner);
}
