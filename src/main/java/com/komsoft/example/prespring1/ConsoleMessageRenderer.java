package com.komsoft.example.prespring1;

public class ConsoleMessageRenderer implements MessageRenderer {
	MessageProvider messageProvider;

	@Override
	public void setMessageProvider(MessageProvider messageProvider) {
		this.messageProvider = messageProvider;
	}

	@Override
	public void render() {
		System.out.println(messageProvider.getMessage());
	}

}
