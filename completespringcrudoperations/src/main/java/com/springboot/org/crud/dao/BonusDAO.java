package com.springboot.org.crud.dao;



import java.util.List;

import com.springboot.org.crud.model.Bonus;

public interface BonusDAO {
	
	public boolean addBonusById(Bonus bonus);

	public boolean deleteBonusById(int workerRefId);

	public Bonus findBonusById(int workerRefId);
	
	public boolean replaceBonus(Bonus bonus);
	
	public List<Bonus> findAllBonus();

}