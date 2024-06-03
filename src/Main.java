/*
* UNIVERSIDAD FRANCISCO GAVIDIA
* FACULTAD DE INGENIERIA Y SISTEMAS
* PROGRAMACIÓN ORIENTADA A OBJETOS - CICLO I 2024
*
* ALUMNO: DAVID ORELLANA | CARNET: OP100417
*
* SISTEMA DE GESTIÓN DE CLIENTES PARA RESTAURANTES
* */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        Restaurante restaurante = new Restaurante();
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar cliente");
            System.out.println("2. Obtener cliente");
            System.out.println("3. Actualizar cliente");
            System.out.println("4. Eliminar cliente");
            System.out.println("5. Agregar reservación");
            System.out.println("6. Obtener reservación");
            System.out.println("7. Actualizar reservación");
            System.out.println("8. Eliminar reservación");
            System.out.println("9. Agregar pedido");
            System.out.println("10. Obtener pedido");
            System.out.println("11. Actualizar pedido");
            System.out.println("12. Eliminar pedido");
            System.out.println("13. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // consume newline left-over

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del cliente:");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese el teléfono del cliente:");
                    String telefono = scanner.nextLine();
                    System.out.println("Ingrese el email del cliente:");
                    String email = scanner.nextLine();
                    Cliente cliente = new Cliente(nombre, telefono, email);
                    restaurante.agregarCliente(cliente);
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del cliente a obtener:");
                    nombre = scanner.nextLine();
                    Cliente clienteObtenido = restaurante.obtenerCliente(nombre);
                    if (clienteObtenido != null) {
                        System.out.println("Cliente obtenido: " + clienteObtenido.getNombre());
                    } else {
                        System.out.println("Cliente no encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del cliente a actualizar:");
                    nombre = scanner.nextLine();
                    System.out.println("Ingrese el nuevo teléfono del cliente:");
                    telefono = scanner.nextLine();
                    System.out.println("Ingrese el nuevo email del cliente:");
                    email = scanner.nextLine();
                    Cliente clienteActualizado = new Cliente(nombre, telefono, email);
                    restaurante.actualizarCliente(clienteActualizado);
                    break;
                case 4:
                    System.out.println("Ingrese el nombre del cliente a eliminar:");
                    nombre = scanner.nextLine();
                    restaurante.eliminarCliente(nombre);
                    break;
                case 5:
                    System.out.println("Ingrese la fecha de la reservación (dd/MM/yyyy):");
                    Date fecha = format.parse(scanner.nextLine());
                    System.out.println("Ingrese la hora de la reservación:");
                    String hora = scanner.nextLine();
                    System.out.println("Ingrese el número de personas para la reservación:");
                    int numeroPersonas = scanner.nextInt();
                    scanner.nextLine(); // consume newline left-over
                    Reservacion reservacion = new Reservacion(fecha, hora, numeroPersonas);
                    restaurante.agregarReservacion(reservacion);
                    break;
                case 6:
                    System.out.println("Ingrese la fecha de la reservación a obtener (dd/MM/yyyy):");
                    fecha = format.parse(scanner.nextLine());
                    Reservacion reservacionObtenida = restaurante.obtenerReservacion(fecha);
                    if (reservacionObtenida != null) {
                        System.out.println("Reservación obtenida para la fecha: " + format.format(reservacionObtenida.getFecha()));
                    } else {
                        System.out.println("Reservación no encontrada.");
                    }
                    break;
                case 7:
                    System.out.println("Ingrese la fecha de la reservación a actualizar (dd/MM/yyyy):");
                    fecha = format.parse(scanner.nextLine());
                    System.out.println("Ingrese la nueva hora de la reservación:");
                    hora = scanner.nextLine();
                    System.out.println("Ingrese el nuevo número de personas para la reservación:");
                    numeroPersonas = scanner.nextInt();
                    scanner.nextLine(); // consume newline left-over
                    Reservacion reservacionActualizada = new Reservacion(fecha, hora, numeroPersonas);
                    restaurante.actualizarReservacion(reservacionActualizada);
                    break;
                case 8:
                    System.out.println("Ingrese la fecha de la reservación a eliminar (dd/MM/yyyy):");
                    fecha = format.parse(scanner.nextLine());
                    restaurante.eliminarReservacion(fecha);
                    break;
                case 9:
                    System.out.println("Ingrese los platos del pedido (separados por coma):");
                    List<String> platos = new ArrayList<>();
                    String[] platosArray = scanner.nextLine().split(",");
                    for (String plato : platosArray) {
                        platos.add(plato.trim());
                    }
                    System.out.println("Ingrese las bebidas del pedido (separadas por coma):");
                    List<String> bebidas = new ArrayList<>();
                    String[] bebidasArray = scanner.nextLine().split(",");
                    for (String bebida : bebidasArray) {
                        bebidas.add(bebida.trim());
                    }
                    Pedido pedido = new Pedido(platos, bebidas);
                    restaurante.agregarPedido(pedido);
                    break;
                case 10:
                    System.out.println("Ingrese los platos del pedido a obtener (separados por coma):");
                    platos = new ArrayList<>();
                    platosArray = scanner.nextLine().split(",");
                    for (String plato : platosArray) {
                        platos.add(plato.trim());
                    }
                    Pedido pedidoObtenido = restaurante.obtenerPedido(platos);
                    if (pedidoObtenido != null) {
                        System.out.println("Pedido obtenido con los platos: " + String.join(", ", pedidoObtenido.getPlatos()));
                    } else {
                        System.out.println("Pedido no encontrado.");
                    }
                    break;
                case 11:
                    System.out.println("Ingrese los platos del pedido a actualizar (separados por coma):");
                    platos = new ArrayList<>();
                    platosArray = scanner.nextLine().split(",");
                    for (String plato : platosArray) {
                        platos.add(plato.trim());
                    }
                    System.out.println("Ingrese las nuevas bebidas del pedido (separadas por coma):");
                    bebidas = new ArrayList<>();
                    bebidasArray = scanner.nextLine().split(",");
                    for (String bebida : bebidasArray) {
                        bebidas.add(bebida.trim());
                    }
                    Pedido pedidoActualizado = new Pedido(platos, bebidas);
                    restaurante.actualizarPedido(pedidoActualizado);
                    break;
                case 12:
                    System.out.println("Ingrese los platos del pedido a eliminar (separados por coma):");
                    platos = new ArrayList<>();
                    platosArray = scanner.nextLine().split(",");
                    for (String plato : platosArray) {
                        platos.add(plato.trim());
                    }
                    restaurante.eliminarPedido(platos);
                    break;
                case 13:
                    System.out.println("Saliendo...");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 13.");
            }
        }
    }
}