package com.example.API.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.API.Service.OwnerService;
import com.example.API.entity.Owner;

@RestController
@RequestMapping("/api/Owner")
public class OwnerController {
    
     @Autowired
OwnerService OwnerService;
@GetMapping("/")
public String getAllOwner(Model model) {
List<Owner> propertyList = OwnerService.getAll();
if(propertyList.size()>0) {
model.addAttribute("property", propertyList);
}
return "propertyList";
}
@GetMapping("/add-property")
public String addproperty(Model model) {
model.addAttribute("Owner", new Owner());
return "add-edit-Owner";
}
@PostMapping("/save-Owner")
public String saveOwner(Owner Owner) {
OwnerService.save(Owner);
return "redirect:/";
}
@GetMapping("/Owner-update/{id}")
public String getOwner(Model model, @PathVariable("id")
Integer id) {
Owner Owner = OwnerService.getById(id);
model.addAttribute("Owner", Owner);
return "add-edit-Owner";
}
@GetMapping("/Owner-delete/{id}")
public String deleteOwner(@PathVariable("id") Integer id)
{
Owner deleteOwner = OwnerService.getById(id);
OwnerService.delete(deleteOwner);
return "redirect:/";
}
}