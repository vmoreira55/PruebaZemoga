package com.prueba.zemoga.app.enums;

import org.springframework.http.HttpStatus;

public enum ErrorCode {
    
	EXITOSO("0000","Ok", HttpStatus.OK),
	FALLIDO("9999","Failed transaction", HttpStatus.BAD_REQUEST),
	CLIENTO_NO_EXISTE("8888","Client not found", HttpStatus.BAD_REQUEST),
	DATA_INVALIDA("7777","Invalid Data", HttpStatus.BAD_REQUEST);

	
	private String code;
	private String message;
	private HttpStatus httpStatus;
	
	private ErrorCode(String code, String message, HttpStatus httpStatus) {
		this.code = code;
		this.message = message;
		this.httpStatus = httpStatus;
	}

	public String getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}
	
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
}
