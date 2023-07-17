package com.spring.patterns.structural.proxy;

public class ProxyImage implements Image{
    private RealImage img;
    private String titulo;
    public ProxyImage(String titulo) {
        this.titulo=titulo;
    }
    @Override
    public void printImage() {
        if (img == null)
            img = new RealImage(titulo);
        img.printImage();
    }

}

