package com.ozaytunctan.elastic.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName="log-index",type="logMessage")
public class LogMessage {

	
	
	@Id
	private Integer id;
	
	//INFO,ERROR,WARN
	private Integer messageType;
	
	private String message;
	
	private String detail;
	
	//POST,GET...
	private Integer level;
	
	
	public LogMessage() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMessageType() {
		return messageType;
	}

	public void setMessageType(Integer messageType) {
		this.messageType = messageType;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}
	
	
	
	
	
	
	
	
}
