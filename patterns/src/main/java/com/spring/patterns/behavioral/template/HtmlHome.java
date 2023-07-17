package com.spring.patterns.behavioral.template;

public class HtmlHome extends HtmlTemplate{

    @Override
    public String header() {
        return "Home Header";
    }

    @Override
    public String body() {
        return "Home Body";
    }
}
