package com.spring.patterns.structural.proxy;

public class RealImage implements Image{
    private String titulo;
    public RealImage(String titulo) {
        this.titulo=titulo;
    }
    @Override
    public void printImage() {
        System.out.println("imagen impresa desde Imagen con título: "+titulo);
    }
}
