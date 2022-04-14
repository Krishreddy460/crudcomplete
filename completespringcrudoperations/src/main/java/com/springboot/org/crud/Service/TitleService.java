package com.springboot.org.crud.Service;



import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.springboot.org.crud.model.Title;
import com.springboot.org.crud.repository.TitleRepository;

@Service
public class TitleService {

	@Resource(name = "tRepo")
	TitleRepository titleRepo;
	
	public boolean createTitleById(int id, String title) {
		return titleRepo.createTitleById(id, title);
	}
	
	public Title findTitleById(int workerRefId) {
		return titleRepo.findTitleById(workerRefId);
	}


	public boolean deleteTitleById(int workerRefId) {
		return titleRepo.deleteTitleById(workerRefId);
	}

	public boolean replaceTitle(Title title) {
		return titleRepo.replaceTitle(title);
	}

	public List<Title> findAllTitles() {
		return titleRepo.findAllTitles();
	}

	
}