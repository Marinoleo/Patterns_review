package com.spring.patterns.behavioral.cahin;

public class Procesar3 implements Proceso{
    private static final int ESTADO = 3;
    private Proceso siguiente;
    public Procesar3(Proceso next) {
        siguiente = next;
    }
    @Override
    public void procesar(int estado) {
        if (estado == ESTADO){
            System.out.println("El proceso se ejecuta en 3");
        } else {
            siguiente.procesar(estado);
        }
    }
}
