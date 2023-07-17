package com.spring.patterns.creational.singleton;

public class NotaCredito {
    CalculoIVA iva = CalculoIVA.getMe();
    public Double totalND (Double total){
        return (total - iva.calcularIVA(total));
    }

}
