package com.spring.patterns.structural.decorator;

public class FotoReal extends Foto{

    public FotoReal() {
        setBrillo(50);
        setContraste(50);
        setSaturación(50);
    }

    @Override
    public void imprimir() {
        System.out.println("imprimiendo Foto");
        System.out.println("Contraste: "+ this.getContraste());
        System.out.println("Brillo: "+ this.getBrillo());
        System.out.println("Saturación: "+ this.getSaturación());

    }
}
