package com.levent.consultantapi.repository.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.levent.consultantapi.model.Consultant;
import com.levent.consultantapi.repository.ConsultantRepository;

@Repository
public class ConsultantStubImpl implements ConsultantRepository {
	
	private Map<Long, Consultant> consultants;
	private Long idIndex;

	public ConsultantStubImpl() {
		// init
		consultants = new HashMap<Long, Consultant>();
		idIndex = 5L;
		
		// populate consultants
		Consultant a = new Consultant(1L, "Levent", "Divilioglu", 36, false, null);
		consultants.put(1L, a);
		Consultant b = new Consultant(2L, "Hakan", "Yorukoglu", 41, true, "Kut-Tech");
		consultants.put(2L, b);
		Consultant c = new Consultant(3L, "Goktug", "Temur", 32, true, "Alfa-5");
		consultants.put(3L, c);
		Consultant d = new Consultant(4L, "Altug", "Dogan", 27, false, null);
		consultants.put(4L, d);
		Consultant e = new Consultant(5L, "Atilla", "Tanridagi", 29, true, "Kafkas-Tech");
		consultants.put(5L, e);
	}

	public List<Consultant> list() {
		return new ArrayList<Consultant>(consultants.values());
	}

	public Consultant create(Consultant consultant) {
		idIndex += idIndex;
		consultant.setId(idIndex);
		consultants.put(idIndex, consultant);
		return consultant;
	}

	public Consultant get(Long id) {
		return consultants.get(id);
	}

	public Consultant update(Long id, Consultant consultant) {
		consultants.put(id, consultant);
		return consultant;
	}

	public Consultant delete(Long id) {
		return consultants.remove(id);
	}
}
