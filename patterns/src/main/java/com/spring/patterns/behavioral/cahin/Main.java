package com.spring.patterns.behavioral.cahin;

public class Main {
    public static void main(String[] args) {
        int estado = 5;

        Proceso p5 = new ProcesarFinal();
        Proceso p4 = new Procesar4(p5);
        Proceso p3 = new Procesar3(p4);
        Proceso p2 = new Procesar2(p3);
        Proceso p1 = new Procesar1(p2);

        p1.procesar(estado);







    }

}
