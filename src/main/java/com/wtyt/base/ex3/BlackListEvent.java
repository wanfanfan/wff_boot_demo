package com.wtyt.base.ex3;

import org.springframework.context.ApplicationEvent;

public class BlackListEvent extends ApplicationEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final String address;
	private final String content;

	public BlackListEvent(Object source, String address, String content) {
		super(source);
		this.address = address;
		this.content = content;
	}

	public String getAddress() {
		return address;
	}

	public String getContent() {
		return content;
	}

}
