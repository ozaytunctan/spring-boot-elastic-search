//package com.ozaytunctan.elastic.conf;
//
//import java.security.SecureRandom;
//import java.util.Random;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import com.ozaytunctan.elastic.model.LogMessage;
//import com.ozaytunctan.elastic.repository.LogMessageRepository;
//
//@Component
//public class Startup implements CommandLineRunner {
//
//	@Autowired
//	private LogMessageRepository log;
//
//	SecureRandom rand = new SecureRandom();
//
//	@Override
//	public void run(String... args) throws Exception {
//
//		LogMessage message = new LogMessage();
//		message.setId(rand.nextInt());
//		message.setMessage("TEST-Messagw");
//		message.setLevel(2);
//		message.setMessageType(3);
//		message.setDetail("Detail");
//
//		log.save(message);
//
//	}
//
//}
