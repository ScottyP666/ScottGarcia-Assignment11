package com.codercampus.Assignment11.service;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.codercampus.Assignment11.domain.Transaction;

@Service
public class TransOrganizer {

	
	public List<Transaction> reorganizeByDate (List<Transaction> returnedListFromFile) {
		Collections.sort( returnedListFromFile);
		return returnedListFromFile;
	}
}
