package org.simplilearn.workshop.controller;

import java.util.List;

import org.simplilearn.workshop.model.Prouduct;

import org.simplilearn.workshop.service.ProuductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/prouduct")
public class ProuductController {

	@Autowired
	private ProuductService prouductService ;
	
	@GetMapping("/list")
	public String listProuducts(Model theModel) {
		
		List<Prouduct> theProuducts = prouductService.getProuducts();
		
		theModel.addAttribute("prouducts", theProuducts);
		
		return "list-prouducts";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Prouduct theProuduct = new Prouduct();
		
		theModel.addAttribute("prouduct", theProuduct);
		
		return "prouduct-form";
	}
	
	@PostMapping("/saveProuduct")
	public String saveProuduct(@ModelAttribute("prouduct") Prouduct theProuduct) {
		
		// save the customer using our service
		prouductService.saveProuduct(theProuduct);	
		
		return "redirect:/prouduct/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("prouductId") int theId,
									Model theModel) {
		
		// get the customer from our service
		Prouduct theProuduct = prouductService.getProuduct(theId);	
		
		// set customer as a model attribute to pre-populate the form
		theModel.addAttribute("prouduct", theProuduct);
		
		// send over to our form		
		return "prouduct-form";
	}
	
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("prouductId") int theId) {
		
		// delete the customer
		prouductService.deleteProuduct(theId);
		
		return "redirect:/prouduct/list";
	}
}
