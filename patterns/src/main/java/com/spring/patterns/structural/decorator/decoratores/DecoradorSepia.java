package com.spring.patterns.structural.decorator.decoratores;

import com.spring.patterns.structural.decorator.Foto;

public class DecoradorSepia extends Decorador{
    private Foto foto;
    DecoradorSepia (Foto foto) {
        this.foto=foto;
    }

    @Override
    public void imprimir() {
        foto.setBrillo(75);
        foto.setContraste(67);
        foto.setSaturación(59);
        System.out.println("Filtro Sepia aplicado");
        foto.imprimir();

    }
}
