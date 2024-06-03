/*
 * UNIVERSIDAD FRANCISCO GAVIDIA
 * FACULTAD DE INGENIERIA Y SISTEMAS
 * PROGRAMACIÓN ORIENTADA A OBJETOS - CICLO I 2024
 *
 * ALUMNO: DAVID ORELLANA | CARNET: OP100417
 *
 * SISTEMA DE GESTIÓN DE CLIENTES PARA RESTAURANTES
 * */

// src/main/java/Cliente.java
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Cliente {
    private String nombre;
    private String telefono;
    private String email;

    public Cliente(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}