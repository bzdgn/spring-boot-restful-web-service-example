package com.levent.consultantapi.repository;

import java.util.List;

import com.levent.consultantapi.model.Consultant;

public interface ConsultantRepository {
	
	List<Consultant> list();
	// CRUD
	Consultant create(Consultant consultant);
	Consultant get(Long id);
	Consultant update(Long id, Consultant consultant);
	Consultant delete(Long id);
	
}
