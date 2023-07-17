package com.spring.patterns.behavioral.observer;

public class Main {
    public static void main(String[] args) {

        Notificacion notificacion = new Notificacion();

        notificacion.agregarSeguidor(new Celu());
        notificacion.agregarSeguidor(new Tablet());
        notificacion.agregarSeguidor(new Notebook());

        notificacion.nuevoMensaje("Hola Mundo");


    }
}
