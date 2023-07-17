package com.spring.patterns.behavioral.observer;

public class Notebook implements ObserverMensaje{
    @Override
    public void recibir(String mensaje) {
        System.out.println("Mensaje "+ mensaje +" recibido desde la notebook");
    }
}
