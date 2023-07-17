package com.spring.patterns.behavioral.cahin;

public class Procesar2 implements Proceso{
    private static final int ESTADO = 2;
    private Proceso siguiente;
    public Procesar2(Proceso next) {
        siguiente = next;
    }
    @Override
    public void procesar(int estado) {
        if (estado == ESTADO){
            System.out.println("El proceso se ejecuta en 2");
        } else {
            siguiente.procesar(estado);
        }
    }
}
