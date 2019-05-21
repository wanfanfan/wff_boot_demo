package com.wtyt.base.ex3;

import org.springframework.context.event.EventListener;

public class BlackListNotifier {

	@EventListener
	public void processBlackListEvent(BlackListEvent event) {
		System.out.println("发送邮件：" + event.getContent() + "到" + event.getAddress());
	}

}
