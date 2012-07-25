package com.apress.prospring3.ch2;

import java.util.Properties;

/**
 * Created by
 * User: jtomas
 * Date: 25/07/12
 * Time: 12:25
 */
public class MessageSupportFactory {
    private static MessageSupportFactory instance = null;
    private Properties props = null;
    private MessageRenderer renderer = null;
    private MessageProvider provider = null;

    public MessageSupportFactory() {
        props = new Properties();

        try {
            //props.load(new FileInputStream("msf.properties"));
            props.load(getClass().getClassLoader().getResourceAsStream("msf.properties"));
            // get the implementation classes
            String rendererClass = props.getProperty("renderer.class");
            String providerClass = props.getProperty("provider.class");
            renderer = (MessageRenderer) Class.forName(rendererClass).newInstance();
            provider = (MessageProvider) Class.forName(providerClass).newInstance();
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    static {
        // Static initialization blocks: http://www.jusfortechies.com/java/core-java/static-blocks.php
        instance = new MessageSupportFactory();
    }

    public static MessageSupportFactory getInstance() {
        return instance;
    }

    public MessageRenderer getMessageRenderer() {
        return renderer;
    }

    public MessageProvider getMessageProvider() {
        return provider;
    }
}
