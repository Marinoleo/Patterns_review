package com.spring.patterns.creational.builder;

public class Usuario {

    private Long id;
    private String nombre;
    private String apellido;
    private String direccion;
    private Integer edad;
    private Double salario;

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public Integer getEdad() {
        return edad;
    }

    public Double getSalario() {
        return salario;
    }

    public Usuario(Long id, String nombre, String apellido, String direccion, Integer edad, Double salario) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.edad = edad;
        this.salario = salario;
    }

    public static class Builder {

        private Long id;
        private String nombre;
        private String apellido;
        private String direccion;
        private Integer edad;
        private Double salario;

        public Usuario build(){
            return new Usuario(id,nombre,apellido,direccion,edad,salario);
        }


        public Long getId() {
            return id;
        }

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public String getNombre() {
            return nombre;
        }

        public Builder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public String getApellido() {
            return apellido;
        }

        public Builder setApellido(String apellido) {
            this.apellido = apellido;
            return this;
        }

        public String getDireccion() {
            return direccion;
        }

        public Builder setDireccion(String direccion) {
            this.direccion = direccion;
            return this;
        }

        public Integer getEdad() {
            return edad;
        }

        public Builder setEdad(Integer edad) {
            this.edad = edad;
            return this;
        }

        public Double getSalario() {
            return salario;
        }

        public Builder setSalario(Double salario) {
            this.salario = salario;
            return this;
        }


    }
}