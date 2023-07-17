package com.spring.patterns.behavioral.template;

import com.sun.jdi.StringReference;

public abstract class HtmlTemplate {

    public void presentar(){
        System.out.println(header()+"\n"+body()+"\n"+footer());
    }

    public abstract String header();
    public abstract String body();
    public  String footer(){
        return "pie de página igual para todos los ejemplos";
    }




}
