package com.spring.patterns.behavioral.template;

public class HtmlContact extends HtmlTemplate{

    @Override
    public String header() {
        return "Contact Header";
    }

    @Override
    public String body() {
        return "Contact Body";
    }
}
