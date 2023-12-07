package com.example.API.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.API.Service.PropertyService;
import com.example.API.Service.RentalContractService;
import com.example.API.Service.RentalContractServiceImpl;
import com.example.API.entity.RentalContract;


@RestController
@RequestMapping("/api/RentalContract")
public class RentalContractController {

   @Autowired
RentalContractService RentalContractService;

@GetMapping("/")
public String getAllRentalContract(Model model) {
List<RentalContract> RentalContractList = RentalContract.getAll();
if(RentalContractList.size()>0) {
model.addAttribute("RentalContract", RentalContractList);
}
return "RentalContractList";
}
@GetMapping("/add-RentalContract")
public String addRentalContract(Model model) {
model.addAttribute("Property", new RentalContract());
return "add-edit-RentalContract";
}
@PostMapping("/save-RentalContract")
public String saveRentalContract(RentalContract RentalContract) {
RentalContractService.save(RentalContract);
return "redirect:/";
}
@GetMapping("/RentalContract-update/{id}")
public String getRentalContract(Model model, @PathVariable("id")
Integer id) {
RentalContract RentalContract = RentalContractService.getById(id);
model.addAttribute("RentalContract", RentalContract);
return "add-edit-RentalContract";
}
@GetMapping("/RentalContract-delete/{id}")
public String deleteRentalContract(@PathVariable("id") Integer id)
{
RentalContract deleteRentalContract = RentalContractService.getById(id);
RentalContractService.delete(deleteRentalContract);
return "redirect:/";
}
}
