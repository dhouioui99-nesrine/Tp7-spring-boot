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
import com.example.API.entity.Property;


@RestController
@RequestMapping("/api/properties")
public class PropertyController {

   @Autowired
PropertyService PropertyService;
@GetMapping("/")
public String getAllproperty(Model model) {
List<Property> propertyList = PropertyService.getAll();
if(propertyList.size()>0) {
model.addAttribute("property", propertyList);
}
return "propertyList";
}
@GetMapping("/add-property")
public String addproperty(Model model) {
model.addAttribute("Property", new Property());
return "add-edit-Property";
}
@PostMapping("/save-Property")
public String saveProperty(Property Property) {
PropertyService.save(Property);
return "redirect:/";
}
@GetMapping("/Property-update/{id}")
public String getProperty(Model model, @PathVariable("id")
Integer id) {
Property Property = PropertyService.getById(id);
model.addAttribute("Property", Property);
return "add-edit-Property";
}
@GetMapping("/Property-delete/{id}")
public String deleteProperty(@PathVariable("id") Integer id)
{
Property deleteProperty = PropertyService.getById(id);
PropertyService.delete(deleteProperty);
return "redirect:/";
}
}
