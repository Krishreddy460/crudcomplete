package com.springboot.org.crud.Service;


import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.springboot.org.crud.model.Bonus;
import com.springboot.org.crud.repository.BonusRepository;

@Service
public class BonusService {
	@Resource(name = "bRepo")
	BonusRepository bonusRepo;

	public Bonus getBonusById(Integer id) {
		return bonusRepo.findBonusById(id);
	}

	public List<Bonus> getAllBonus() {
		return bonusRepo.findAllBonus();
	}

	public boolean createBonus(Bonus bonus) {
		return bonusRepo.addBonusById(bonus);
	}

	public boolean deleteBonusById(Integer id) {
		return bonusRepo.deleteBonusById(id);
	}
	
}