package com.spring.patterns.creational.singleton;

public class CalculoIVA {
    private static CalculoIVA iva;
    private CalculoIVA() {}

    public static CalculoIVA getMe(){
        if (iva== null)
            iva = new CalculoIVA();
        return iva;
    }

    public Double calcularIVA(Double neto){
        return neto*0.21;
    }
}

