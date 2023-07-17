package com.spring.patterns.structural.decorator.decoratores;

import com.spring.patterns.structural.decorator.Foto;
import com.spring.patterns.structural.decorator.FotoReal;

public class Main {
    public static void main(String[] args) {
        Foto fotoVirgen = new FotoReal();

        fotoVirgen.imprimir();

        Decorador fotoSepia = new DecoradorSepia(fotoVirgen);

        fotoSepia.imprimir();
        fotoVirgen.imprimir();
    }
}
