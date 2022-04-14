package com.springboot.org.crud.dao;


import java.util.List;

import com.springboot.org.crud.model.Title;

public interface TitleDAO {
	
	public boolean createTitleById(int id, String title);
	
	public Title findTitleById(int workerRefId);
	
	public boolean deleteTitleById(int workerRefId);

	public boolean replaceTitle(Title title);

	public List<Title> findAllTitles();

}