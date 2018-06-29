package com.levent.consultantapi.service.info.impl;

import com.levent.consultantapi.service.InfoService;

public class InfoServiceImpl1 implements InfoService {

	@Override
	public String getGreet() {
		return "Consultant-Api version 1 is up and running.";
	}

}
