package com.infinite.crm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infinite.crm.repository.ISellHistoryRepo;

@Service
public class SellHistoryService {

	@Autowired
	ISellHistoryRepo ISellHistoryRepo;
}
