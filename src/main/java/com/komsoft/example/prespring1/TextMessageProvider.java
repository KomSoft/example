package com.komsoft.example.prespring1;

public class TextMessageProvider implements MessageProvider {

	@Override
	public String getMessage() {
		return "Some text from Text Message Provider";
	}

}
