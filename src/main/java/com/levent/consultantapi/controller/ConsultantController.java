package com.levent.consultantapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.levent.consultantapi.model.Consultant;
import com.levent.consultantapi.service.ConsultantService;
import com.levent.consultantapi.service.InfoService;

@RestController
@RequestMapping("api/v1/")
public class ConsultantController {
	
	@Autowired
	private ConsultantService consultantService;
	
	@Autowired
	private InfoService greeter;
	
	public ConsultantController() {}
	
	@RequestMapping("/test")
	public String test() {
		return greeter.getGreet();
	}
	
	@RequestMapping(value = "consultants", method = RequestMethod.GET) 
	public List<Consultant> list() {
		return consultantService.getConsultants();
	}
	
	// crud
	@RequestMapping(value = "consultants", method = RequestMethod.POST) 
	public Consultant create(@RequestBody Consultant consultant) {
		return consultantService.createConsultant(consultant);
	}
	
	@RequestMapping(value = "consultants/{id}", method = RequestMethod.GET) 
	public Consultant get(@PathVariable Long id) {
		return consultantService.getConsultantById(id);
	}
	
	@RequestMapping(value = "consultants/{id}", method = RequestMethod.PUT) 
	public Consultant update(@PathVariable Long id, @RequestBody Consultant shipwreck) {
		return consultantService.updateConsultantById(id, shipwreck);
	}
	
	@RequestMapping(value = "consultants/{id}", method = RequestMethod.DELETE) 
	public Consultant delete(@PathVariable Long id) {
		return consultantService.deleteConsultantById(id);
	}
	
}
