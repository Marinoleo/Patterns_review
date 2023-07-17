package com.spring.patterns.creational.singleton;

public class Main {
    public static void main(String[] args) {

        CalculoIVA calculo1 = CalculoIVA.getMe();
        CalculoIVA calculo2 = CalculoIVA.getMe();

        if (calculo2==calculo1) System.out.println("Asi se ven las clases creadas con Singleton\nSon en realidad la misma clase" );
        System.out.println(calculo2);
        System.out.println(calculo1);

        Factura factura = new Factura();
        NotaCredito notaCredito = new NotaCredito();

        Double monto = 100D;
        System.out.println(factura.totalF(monto));
        System.out.println(notaCredito.totalND(monto));




    }
}
