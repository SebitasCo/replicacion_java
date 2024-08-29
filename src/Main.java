import java.util.InputMismatchException;
import java.util.Scanner;

import facturacion.model.java.Cliente;
import facturacion.model.java.ÍtemFactura;
import facturacion.model.java.Producto;
import facturacion.model.java.Factura;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNif("5555-5");
        cliente.setNombre("Andrés");

        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese una descripción de la factura: ");
        String desc = s.nextLine();
        Factura factura = new Factura(desc, cliente);

        Producto producto;

        System.out.println();

        for (int i = 0; i < 5; i++) {
            producto = new Producto();
            System.out.print("Ingrese el código del producto nº " + (i + 1) + ": ");
            producto.setCodigo(s.nextLine()); // Asegúrate de que el código se establezca

            System.out.print("Ingrese el nombre del producto: ");
            producto.setNombre(s.nextLine());

            float precio = 0.0f;
            int cantidad = 0;

            // Manejo de excepciones para el precio
            while (true) {
                try {
                    System.out.print("Ingrese el precio: ");
                    precio = s.nextFloat();
                    break; // Salir del bucle si la entrada es válida
                } catch (InputMismatchException e) {
                    System.out.println("Entrada no válida. Por favor ingrese un número decimal para el precio.");
                    s.next(); // Limpiar el buffer
                }
            }

            // Manejo de excepciones para la cantidad
            while (true) {
                try {
                    System.out.print("Ingrese la cantidad: ");
                    cantidad = s.nextInt();
                    break; // Salir del bucle si la entrada es válida
                } catch (InputMismatchException e) {
                    System.out.println("Entrada no válida. Por favor ingrese un número entero para la cantidad.");
                    s.next(); // Limpiar el buffer
                }
            }

            factura.addItemFactura(new ÍtemFactura(cantidad, producto));
            System.out.println();
            s.nextLine(); // Limpiar el buffer después de leer un entero
        }

        System.out.println(factura);
        s.close(); // Cerrar el scanner
    }
}
