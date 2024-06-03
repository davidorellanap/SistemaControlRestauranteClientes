/*
 * UNIVERSIDAD FRANCISCO GAVIDIA
 * FACULTAD DE INGENIERIA Y SISTEMAS
 * PROGRAMACIÓN ORIENTADA A OBJETOS - CICLO I 2024
 *
 * ALUMNO: DAVID ORELLANA | CARNET: OP100417
 *
 * SISTEMA DE GESTIÓN DE CLIENTES PARA RESTAURANTES
 * */

// src/main/java/Reservacion.java
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Reservacion {
    private Date fecha;
    private String hora;
    private int numeroPersonas;

    public Reservacion(Date fecha, String hora, int numeroPersonas) {
        this.fecha = fecha;
        this.hora = hora;
        this.numeroPersonas = numeroPersonas;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }
}