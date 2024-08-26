package facturacion.model.java;


import java.util.Date;

public class Factura {
    private int folio;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private ÍtemFactura[] items;
    private ÍtemFactura[] ítems;

    // Getter para folio
    public int getFolio() {
        return folio;
    }

    // Setter para folio
    public void setFolio(int folio) {
        this.folio = folio;
    }

    // Getter para descripcion
    public String getDescripcion() {
        return descripcion;
    }

    // Setter para descripcion
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Getter para fecha
    public Date getFecha() {
        return fecha;
    }

    // Setter para fecha
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    // Getter para cliente
    public Cliente getCliente() {
        return cliente;
    }

    // Setter para cliente
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    // Getter para items
    public ÍtemFactura[] getItems() {
        return items;
    }

    // Setter para items
    public void setItems(ÍtemFactura[] items) {
        this.ítems = items;
    }
}
