package com.apress.prospring3.ch2;

/**
 * Created by
 * User: jtomas
 * Date: 25/07/12
 * Time: 11:11
 */
public interface MessageRenderer {
    public void render();

    public void setMessageProvider(MessageProvider provider);

    public MessageProvider getMessageProvider();
}
