package com.levent.consultantapi.service.info.impl;

import com.levent.consultantapi.service.InfoService;

public class InfoServiceImpl3 implements InfoService {

	@Override
	public String getGreet() {
		return "Consultant-Api\nVersion: 1.0.0\nWritten by: Levent Divilioglu";
	}

}
