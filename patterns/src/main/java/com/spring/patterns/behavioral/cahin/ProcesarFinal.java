package com.spring.patterns.behavioral.cahin;

public class ProcesarFinal implements Proceso{
    private static final int ESTADO = 5;
    private Proceso siguiente;
    public ProcesarFinal(){};
    @Override
    public void procesar(int estado) {
        if (estado == ESTADO){
            System.out.println("El proceso se ejecuta en 5 - FINAL");
        } else {
            siguiente.procesar(estado);
        }
    }
}
