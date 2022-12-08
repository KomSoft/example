package com.komsoft.example.prespring;

import com.komsoft.example.prespring.factory.ApplicationSupportFactory;

public class Main {

    public static void main(String[] args) {
        ApplicationSupportFactory factory = ApplicationSupportFactory.getInstance();
        MessageProvider messageProvider = factory.getMessageProvider();
        MessageRenderer messageRenderer = factory.getMessageRenderer();

        messageRenderer.setMessageProvider(messageProvider);
        messageRenderer.render();

    }
}
