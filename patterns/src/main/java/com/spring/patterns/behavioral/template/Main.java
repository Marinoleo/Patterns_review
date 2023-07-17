package com.spring.patterns.behavioral.template;

public class Main {
    public static void main(String[] args) {

        HtmlTemplate home = new HtmlHome();
        HtmlTemplate contact = new HtmlContact();

        home.presentar();
        contact.presentar();

    }
}
