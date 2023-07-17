package com.spring.patterns.behavioral.cahin;

public class Procesar4 implements Proceso{
    private static final int ESTADO = 4;
    private Proceso siguiente;
    public Procesar4(Proceso next) {
        siguiente = next;
    }
    @Override
    public void procesar(int estado) {
        if (estado == ESTADO){
            System.out.println("El proceso se ejecuta en 4");
        } else {
            siguiente.procesar(estado);
        }
    }
}
