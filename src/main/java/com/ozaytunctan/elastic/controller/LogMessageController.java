package com.ozaytunctan.elastic.controller;

import java.util.List;
import java.util.stream.Collectors;

import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ozaytunctan.elastic.model.LogMessage;
import com.ozaytunctan.elastic.service.LogMessageService;

@RestController
public class LogMessageController {

	@Autowired
	private LogMessageService logMessageService;

	@GetMapping("/log-detail")
	public ResponseEntity<List<LogMessage>> getLog() {
		return ResponseEntity.ok().body(logMessageService.logDetailList().stream().collect(Collectors.toList()));
	}

}
