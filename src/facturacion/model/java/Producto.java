package facturacion.model.java;

public class Producto {
    private String codigo;
    private String nombre;
    private double precio;

    private static int ultimocodigo;

    public Producto(){
        ultimocodigo++;
        this.codigo= ( "ingrese el nombre del producto");
        this.nombre=nombre;
        this.precio=precio;
    }

public String getCodigo() {
    return codigo;
}


public void setCodigo(String codigo) {
    this.codigo = codigo;
}

public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public double precio() {
    return precio;
}


public void setPrecio(double precio) {
    this.precio = precio;
}


    public double getPrecio() {
    return precio;
    }
}