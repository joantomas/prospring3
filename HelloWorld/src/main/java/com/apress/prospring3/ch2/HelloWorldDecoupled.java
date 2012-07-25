package com.apress.prospring3.ch2;

/**
 * Created by
 * User: jtomas
 * Date: 25/07/12
 * Time: 11:20
 */
public class HelloWorldDecoupled {

    public static void main(String[] args) {
        MessageRenderer mr = new StandardOutMessageRenderer();
        MessageProvider mp = new HelloWorldMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }
}
