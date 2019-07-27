package com.test.test;


import java.util.List;
import repo.TestRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/rest")
public class TestController {

	@Autowired
	private TestRepo testRepo;
	
	
	@GetMapping(value="/all")
	public List<BeWrkrProfile> getAll(){
		
		return testRepo.findAll();
		
		
		
	}
	
	@GetMapping(value="/save")
	public List<BeWrkrProfile> save(){
		
		BeWrkrProfile beWrkr = new BeWrkrProfile();
	
		beWrkr.setName("vrun");
		beWrkr.setAddress("Malaysia");
		beWrkr.setCity("KL");
		beWrkr=	testRepo.save(beWrkr);
		
		beWrkr = new BeWrkrProfile();
	/*	beWrkr.setId();*/
		beWrkr.setName("siva");
		beWrkr.setAddress("Malaysia");
		beWrkr.setCity("KL");
		beWrkr=	testRepo.save(beWrkr);
		
		return testRepo.findAll();
		
		
		
		
	}
	
	
}
