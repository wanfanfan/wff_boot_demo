package com.wtyt.base.example2;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class ResultMessage {
	private String code = "1";

	private String message = "哈哈";

	public String getCode() {
		return code;
	}

	//@Required
	public void setCode(String code) {
		//code = "123123";
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	//@Required
	public void setMessage(String message) {
		//message = "嘿嘿";
		this.message = message;
	}
}
