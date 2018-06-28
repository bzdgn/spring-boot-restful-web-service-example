package com.levent.consultantapi.repository.impl;

import org.springframework.data.jpa.repository.JpaRepository;

import com.levent.consultantapi.model.Consultant;

public interface ConsultantJPARepository extends JpaRepository<Consultant, Long> {
}
