package com.levent.consultantapi.service;

import java.util.List;

import com.levent.consultantapi.model.Consultant;

public interface ConsultantService {
	
	List<Consultant> getConsultants();
	Consultant createConsultant(Consultant consultant);
	Consultant getConsultantById(Long id);
	Consultant updateConsultantById(Long id, Consultant consultant);
	Consultant deleteConsultantById(Long id);

}
