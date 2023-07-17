package com.spring.patterns.behavioral.observer;

public class Tablet implements ObserverMensaje{
    @Override
    public void recibir(String mensaje) {
        System.out.println("Mensaje "+ mensaje +" recibido desde la Tablet");
    }
}
