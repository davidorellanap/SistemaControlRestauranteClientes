/*
 * UNIVERSIDAD FRANCISCO GAVIDIA
 * FACULTAD DE INGENIERIA Y SISTEMAS
 * PROGRAMACIÓN ORIENTADA A OBJETOS - CICLO I 2024
 *
 * ALUMNO: DAVID ORELLANA | CARNET: OP100417
 *
 * SISTEMA DE GESTIÓN DE CLIENTES PARA RESTAURANTES
 * */

// src/main/java/Restaurante.java
import java.util.ArrayList;
import java.util.List;
import java.util.Date;


public class Restaurante {
    private List<Cliente> clientes;
    private List<Reservacion> reservaciones;
    private List<Pedido> pedidos;

    public Restaurante() {
        this.clientes = new ArrayList<>();
        this.reservaciones = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public Cliente obtenerCliente(String nombre) {
        for (Cliente cliente : clientes) {
            if (cliente.getNombre().equals(nombre)) {
                return cliente;
            }
        }
        return null;
    }

    public void actualizarCliente(Cliente cliente) {
        Cliente c = obtenerCliente(cliente.getNombre());
        if (c != null) {
            c.setTelefono(cliente.getTelefono());
            c.setEmail(cliente.getEmail());
        }
    }

    public void eliminarCliente(String nombre) {
        clientes.removeIf(cliente -> cliente.getNombre().equals(nombre));
    }

    public void agregarReservacion(Reservacion reservacion) {
        reservaciones.add(reservacion);
    }

    public Reservacion obtenerReservacion(Date fecha) {
        for (Reservacion reservacion : reservaciones) {
            if (reservacion.getFecha().equals(fecha)) {
                return reservacion;
            }
        }
        return null;
    }

    public void actualizarReservacion(Reservacion reservacion) {
        Reservacion r = obtenerReservacion(reservacion.getFecha());
        if (r != null) {
            r.setHora(reservacion.getHora());
            r.setNumeroPersonas(reservacion.getNumeroPersonas());
        }
    }

    public void eliminarReservacion(Date fecha) {
        reservaciones.removeIf(reservacion -> reservacion.getFecha().equals(fecha));
    }

    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public Pedido obtenerPedido(List<String> platos) {
        for (Pedido pedido : pedidos) {
            if (pedido.getPlatos().equals(platos)) {
                return pedido;
            }
        }
        return null;
    }

    public void actualizarPedido(Pedido pedido) {
        Pedido p = obtenerPedido(pedido.getPlatos());
        if (p != null) {
            p.setBebidas(pedido.getBebidas());
        }
    }

    public void eliminarPedido(List<String> platos) {
        pedidos.removeIf(pedido -> pedido.getPlatos().equals(platos));
    }
}