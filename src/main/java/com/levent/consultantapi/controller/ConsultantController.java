package com.levent.consultantapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.levent.consultantapi.model.Consultant;
import com.levent.consultantapi.repository.ConsultantRepository;
import com.levent.consultantapi.repository.ConsultantStubImpl;

@RestController
@RequestMapping("api/v1/")
public class ConsultantController {
	
	private ConsultantRepository consultantRepository;
	
	public ConsultantController() {
		this.consultantRepository = new ConsultantStubImpl();
	}
	
	@RequestMapping("/")
	public String test() {
		return "ConsultantController is up and working.";
	}
	
	@RequestMapping(value = "consultants", method = RequestMethod.GET) 
	public List<Consultant> list() {
		return consultantRepository.list();
	}
	
	// crud
	@RequestMapping(value = "consultants", method = RequestMethod.POST) 
	public Consultant create(@RequestBody Consultant shipwreck) {
		return consultantRepository.create(shipwreck);
	}
	
	@RequestMapping(value = "consultants/{id}", method = RequestMethod.GET) 
	public Consultant get(@PathVariable Long id) {
		return consultantRepository.get(id);
	}
	
	@RequestMapping(value = "consultants/{id}", method = RequestMethod.PUT) 
	public Consultant update(@PathVariable Long id, @RequestBody Consultant shipwreck) {
		return consultantRepository.update(id, shipwreck);
	}
	
	@RequestMapping(value = "consultants/{id}", method = RequestMethod.DELETE) 
	public Consultant delete(@PathVariable Long id) {
		return consultantRepository.delete(id);
	}
	
}
