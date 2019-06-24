package com.ozaytunctan.elastic.service;

import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ozaytunctan.elastic.model.LogMessage;
import com.ozaytunctan.elastic.repository.LogMessageRepository;

@Service
public class LogMessageService {

	@Autowired
	private LogMessageRepository log;

	public Page<LogMessage> logDetailList() {
		LogMessage message = new LogMessage();
		message.setId(new Random().nextInt());
		message.setMessage("TEST-Messagw");
		message.setLevel(2);
		message.setMessageType(3);
		message.setDetail("Detail");

		log.save(message);

		Page<LogMessage> messages = log.findAll(PageRequest.of(0, 10));
		return messages;
	}

}
