package com.spring.patterns.structural.decorator;

public abstract class Foto {
    private int brillo;
    private int saturación;
    private int contraste;

    public void imprimir(){}

    public int getBrillo() {
        return brillo;
    }

    public void setBrillo(int brillo) {
        this.brillo = brillo;
    }

    public int getSaturación() {
        return saturación;
    }

    public void setSaturación(int saturación) {
        this.saturación = saturación;
    }

    public int getContraste() {
        return contraste;
    }

    public void setContraste(int contraste) {
        this.contraste = contraste;
    }
}
