package com.example.API.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.API.Repository.PropertyRepository;
import com.example.API.entity.Property;




@Service
public class PropertyServiceImpl implements PropertyService {
@Autowired
PropertyRepository PropertyRepository;
@Override
public void save(Property Property) {
if (Property.getId() == null) {
PropertyRepository.save(Property);
} else {
Property Propertyupdate =
PropertyRepository.findById(Property.getId()).get();
Propertyupdate.setAddress(Property.getAddress());
Propertyupdate.setPrice(Property.getPrice());

PropertyRepository.save(Propertyupdate);
}
}
@Override
public List<Property> getAll() {
return PropertyRepository.findAll();
}
@Override
public Property getById(Integer id) {
return PropertyRepository.findById(id).get();
}
@Override
public void delete(Property Property) {
PropertyRepository.delete(Property);
}
}
