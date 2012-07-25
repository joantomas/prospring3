package com.apress.prospring3.ch2;

/**
 * Created by
 * User: jtomas
 * Date: 25/07/12
 * Time: 11:15
 */
public class StandardOutMessageRenderer implements MessageRenderer {

    private MessageProvider messageProvider = null;

    @Override
    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException(
                    "You must set the property messageProvider of class:"
                            + StandardOutMessageRenderer.class.getName());
        }
        System.out.println(messageProvider.getMessage());

    }

    @Override
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}
