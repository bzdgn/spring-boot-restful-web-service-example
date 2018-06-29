package com.levent.consultantapi.service.info.impl;

import java.util.Date;

import com.levent.consultantapi.service.InfoService;

public class InfoServiceImpl4 implements InfoService {

	@Override
	public String getGreet() {
		return "Consultant Api is running: Date: " + new Date();
	}

}
