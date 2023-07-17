package com.spring.patterns.structural.proxy;

public class Main {
    public static void main(String[] args) {
        Image imagen = new ProxyImage("Foto");
        //Hasta aca no se instanció ninguna clase de RealImage
        imagen.printImage();
    }
}
