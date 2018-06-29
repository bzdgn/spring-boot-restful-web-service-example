package com.levent.consultantapi.service.consultant.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.levent.consultantapi.model.Consultant;
import com.levent.consultantapi.repository.ConsultantRepository;
import com.levent.consultantapi.service.ConsultantService;

@Service
public class ConsultantServiceImpl implements ConsultantService {
	
	@Autowired
	private ConsultantRepository consultantRepository;
	
	@Override
	public List<Consultant> getConsultants() {
		return consultantRepository.list();
	}

	@Override
	public Consultant createConsultant(Consultant consultant) {
		return consultantRepository.create(consultant);
	}

	@Override
	public Consultant getConsultantById(Long id) {
		return consultantRepository.get(id);
	}

	@Override
	public Consultant updateConsultantById(Long id, Consultant consultant) {
		return consultantRepository.update(id, consultant);
	}

	@Override
	public Consultant deleteConsultantById(Long id) {
		return consultantRepository.delete(id);
	}

}
