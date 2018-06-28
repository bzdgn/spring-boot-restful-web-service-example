package com.levent.consultantapi.repository.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.levent.consultantapi.model.Consultant;
import com.levent.consultantapi.repository.ConsultantRepository;

@Primary
@Repository
public class ConsultantJPARepositoryImpl implements ConsultantRepository {
	
	@Autowired
	@Lazy
	private ConsultantJPARepository consultantJPARepository;
	
	@Override
	public List<Consultant> list() {
		System.out.println("JPA Repo: " + consultantJPARepository);
		
		return consultantJPARepository.findAll();
	}

	@Override
	public Consultant create(Consultant consultant) {
		return consultantJPARepository.saveAndFlush(consultant);
	}

	@Override
	public Consultant get(Long id) {
		return consultantJPARepository.findOne(id);
	}

	@Override
	public Consultant update(Long id, Consultant consultant) {
		Consultant existingConsultant = consultantJPARepository.findOne(id);
		BeanUtils.copyProperties(consultant, existingConsultant);
		
		return consultantJPARepository.saveAndFlush(existingConsultant);
	}

	@Override
	public Consultant delete(Long id) {
		Consultant existingConsultant = consultantJPARepository.findOne(id);
		consultantJPARepository.delete(existingConsultant);
		
		return existingConsultant;
	}

}
