
package facturacion.model.java;

public class ÍtemFactura {
    private Producto producto;
    private int cantidad;

    public ÍtemFactura(int cantidad, Producto producto) {
        this.producto = producto;
        this.cantidad = cantidad;
    }




    // Getter para producto
    public Producto getProducto() {
        return producto;
    }

    // Setter para producto
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    // Getter para cantidad
    public int getCantidad() {
        return cantidad;
    }

    // Setter para cantidad
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    public float calcularImporte() {
        return (float) (cantidad-producto.getPrecio());
    }


    @Override
    public String toString() {
        return producto.getNombre() + "\t" + cantidad + "\t" + calcularImporte();
    }
}