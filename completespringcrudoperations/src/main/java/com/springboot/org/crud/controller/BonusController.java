package com.springboot.org.crud.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.org.crud.model.Bonus;
import com.springboot.org.crud.Service.BonusService;

@RestController
@RequestMapping("/worker/bonus")
public class BonusController {
	@Autowired
	BonusService bonusServc;
	
	@GetMapping("/showBonus/{id}")
	public Bonus showBonus(@PathVariable int id) {
		return bonusServc.getBonusById(id);
	}
	
	@GetMapping("/showAllBonus")
	public List<Bonus> showAllBonus() {
		return bonusServc.getAllBonus();
	}
	
	@PostMapping("/create/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public boolean create(@RequestBody Bonus bonus) {
		return bonusServc.createBonus(bonus);	
	}
	
	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable int id) {
		return bonusServc.deleteBonusById(id);
	}
}
