package com.hola.recyclerviewcardview;

public class Usuarios {
    public String color;
    public String nombre;
    public String numero;
    public String email;

    public Usuarios(String color, String nombre, String numero, String email) {
        this.color = color;
        this.nombre = nombre;
        this.numero = numero;
        this.email = email;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
