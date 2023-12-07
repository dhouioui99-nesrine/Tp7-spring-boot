package com.example.API.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.API.Repository.RentalContractRepository;
import com.example.API.entity.RentalContract;



@Service
public class RentalContractServiceImpl implements PropertyService {
@Autowired
RentalContractRepository RentalContractRepository;
@Override
public void save(RentalContract RentalContract) {
if (RentalContract.getId() == null) {
RentalContractRepository.save(RentalContract);
} else {
RentalContract RentalContractupdate =
RentalContractRepository.findById(RentalContract.getId()).get();
RentalContractupdate.setProperty(RentalContract.getProperty());
RentalContractupdate.setOwner(RentalContract.getOwner());

RentalContractupdate.setTenant(RentalContract.getTenant());
RentalContractupdate.setMonthlyRent(RentalContract.getMonthlyRent());

RentalContractRepository.save(RentalContractupdate);
}
}
@Override
public List<RentalContract> getAll() {
return RentalContractRepository.findAll();
}
@Override
public RentalContract getById(Integer id) {
return RentalContractRepository.findById(id).get();
}
@Override
public void delete(RentalContract RentalContract) {
RentalContractRepository.delete(RentalContract);
}
}
