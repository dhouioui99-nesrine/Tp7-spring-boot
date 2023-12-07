package com.example.API.Service;
import java.util.List;

import com.example.API.entity.Property;


public interface PropertyService {
void save(Property Property);
List<Property> getAll();
Property getById(Integer id);
void delete(Property Property);
}
