package com.infinite.crm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infinite.crm.repository.IUserRepo;

@Service
public class UserService {
	@Autowired
	IUserRepo ISerIUserRepo;
}
