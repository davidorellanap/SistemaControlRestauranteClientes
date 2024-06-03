/*
 * UNIVERSIDAD FRANCISCO GAVIDIA
 * FACULTAD DE INGENIERIA Y SISTEMAS
 * PROGRAMACIÓN ORIENTADA A OBJETOS - CICLO I 2024
 *
 * ALUMNO: DAVID ORELLANA | CARNET: OP100417
 *
 * SISTEMA DE GESTIÓN DE CLIENTES PARA RESTAURANTES
 * */

// src/main/java/Pedido.java
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Pedido {
    private List<String> platos;
    private List<String> bebidas;

    public Pedido(List<String> platos, List<String> bebidas) {
        this.platos = platos;
        this.bebidas = bebidas;
    }

    public List<String> getPlatos() {
        return platos;
    }

    public void setPlatos(List<String> platos) {
        this.platos = platos;
    }

    public List<String> getBebidas() {
        return bebidas;
    }

    public void setBebidas(List<String> bebidas) {
        this.bebidas = bebidas;
    }
}