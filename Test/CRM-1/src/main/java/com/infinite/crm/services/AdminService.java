package com.infinite.crm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infinite.crm.repository.IAdminRepo;

@Service
public class AdminService {
	@Autowired
	IAdminRepo IAdminRepo;
	
}
