package com.example.API.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.API.Repository.OwnerRepository;
import com.example.API.entity.Owner;

@Service
public class OwnerServiceImpl implements OwnerService {
@Autowired
OwnerRepository OwnerRepository;
@Override
public void save(Owner Owner) {
if (Owner.getId() == null) {
OwnerRepository.save(Owner);
} else {
Owner Ownerupdate =
OwnerRepository.findById(Owner.getId()).get();
Ownerupdate.setName(Owner.getName());
Ownerupdate.setContactInformation(Owner.getContactInformation());

OwnerRepository.save(Ownerupdate);
}
}
@Override
public List<Owner> getAll() {
return OwnerRepository.findAll();
}
@Override
public Owner getById(Integer id) {
return OwnerRepository.findById(id).get();
}
@Override
public void delete(Owner Owner) {
OwnerRepository.delete(Owner);
}
}

