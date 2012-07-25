package com.apress.prospring3.ch2;

/**
 * Created by
 * User: jtomas
 * Date: 25/07/12
 * Time: 11:05
 */
public class HelloWorldWithCommandLine {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println(args[0]);
        } else {
            System.out.println("Hello World!");
        }
    }
}
