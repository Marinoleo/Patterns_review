package com.spring.patterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        //Con Builder
        Usuario user = new Usuario.Builder().setEdad(37).setApellido("Coufis").setNombre("Marino").build();

        System.out.println(user.getNombre());
        System.out.println(user.getEdad());
        System.out.println(user.getApellido());
        System.out.println(user.getSalario());

        //Sin Builder
        Usuario user2 = new Usuario(7L,"Marco","Antonio",null,null,null);

        System.out.println(user2.getNombre());
        System.out.println(user2.getEdad());
        System.out.println(user2.getApellido());
        System.out.println(user2.getSalario());
    }
}
