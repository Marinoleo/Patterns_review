package com.spring.patterns.creational.singleton;

public class Factura {
    CalculoIVA iva = CalculoIVA.getMe();
    public Double totalF (Double monto){
        return (monto + iva.calcularIVA(monto));
    }

}
