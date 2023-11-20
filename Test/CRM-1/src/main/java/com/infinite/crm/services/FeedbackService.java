package com.infinite.crm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infinite.crm.repository.IFeedbackRepo;

@Service
public class FeedbackService {
	@Autowired
	IFeedbackRepo IFeedbackRepo;
}
