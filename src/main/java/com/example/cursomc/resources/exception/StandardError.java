package com.example.cursomc.resources.exception;

import java.io.Serializable;

public class StandardError implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	private Long timestamp;
	private Integer status;
	private String message;
	private String error;
	private String path;
	
	

	public StandardError(Long timestamp, Integer status, String message, String error, String path) {
		super();
		this.timestamp = timestamp;
		this.status = status;
		this.message = message;
		this.error = error;
		this.path = path;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timeStamp) {
		this.timestamp = timeStamp;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	
	
}
